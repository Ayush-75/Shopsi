package com.ayushsapplication.app.modules.addpayment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityAddPaymentBinding
import com.ayushsapplication.app.modules.addpayment.`data`.viewmodel.AddPaymentVM
import com.ayushsapplication.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import kotlin.String
import kotlin.Unit

class AddPaymentActivity : BaseActivity<ActivityAddPaymentBinding>(R.layout.activity_add_payment) {
  private val viewModel: AddPaymentVM by viewModels<AddPaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addPaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
    binding.linearPaymentOptionPaypal.setOnClickListener {
      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_PAYMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddPaymentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
