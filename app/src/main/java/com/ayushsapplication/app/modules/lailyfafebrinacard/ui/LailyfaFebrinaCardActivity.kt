package com.ayushsapplication.app.modules.lailyfafebrinacard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityLailyfaFebrinaCardBinding
import com.ayushsapplication.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import com.ayushsapplication.app.modules.lailyfafebrinacard.`data`.viewmodel.LailyfaFebrinaCardVM
import kotlin.String
import kotlin.Unit

class LailyfaFebrinaCardActivity :
    BaseActivity<ActivityLailyfaFebrinaCardBinding>(R.layout.activity_lailyfa_febrina_card) {
  private val viewModel: LailyfaFebrinaCardVM by viewModels<LailyfaFebrinaCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lailyfaFebrinaCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
    binding.btnSave.setOnClickListener {
      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LAILYFA_FEBRINA_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LailyfaFebrinaCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
