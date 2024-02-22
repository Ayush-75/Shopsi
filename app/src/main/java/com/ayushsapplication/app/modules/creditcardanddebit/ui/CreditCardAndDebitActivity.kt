package com.ayushsapplication.app.modules.creditcardanddebit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityCreditCardAndDebitBinding
import com.ayushsapplication.app.modules.addcard.ui.AddCardActivity
import com.ayushsapplication.app.modules.creditcardanddebit.`data`.model.CreditcarditemsRowModel
import com.ayushsapplication.app.modules.creditcardanddebit.`data`.viewmodel.CreditCardAndDebitVM
import com.ayushsapplication.app.modules.lailyfafebrinacard.ui.LailyfaFebrinaCardActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CreditCardAndDebitActivity :
    BaseActivity<ActivityCreditCardAndDebitBinding>(R.layout.activity_credit_card_and_debit) {
  private val viewModel: CreditCardAndDebitVM by viewModels<CreditCardAndDebitVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val creditCardItemsAdapter =
    CreditCardItemsAdapter(viewModel.creditCardItemsList.value?:mutableListOf())
    binding.recyclerCreditCardItems.adapter = creditCardItemsAdapter
    creditCardItemsAdapter.setOnItemClickListener(
    object : CreditCardItemsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CreditcarditemsRowModel) {
        onClickRecyclerCreditCardItems(view, position, item)
      }
    }
    )
    viewModel.creditCardItemsList.observe(this) {
      creditCardItemsAdapter.updateData(it)
    }
    binding.creditCardAndDebitVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
    binding.btnAddCard.setOnClickListener {
      val destIntent = AddCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCreditCardItems(
    view: View,
    position: Int,
    item: CreditcarditemsRowModel
  ): Unit {
    when(view.id) {
      R.id.linearCreditCardItem -> {
        val destIntent = LailyfaFebrinaCardActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CREDIT_CARD_AND_DEBIT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreditCardAndDebitActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
