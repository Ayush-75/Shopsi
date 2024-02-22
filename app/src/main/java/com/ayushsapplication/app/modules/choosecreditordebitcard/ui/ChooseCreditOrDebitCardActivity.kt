package com.ayushsapplication.app.modules.choosecreditordebitcard.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityChooseCreditOrDebitCardBinding
import com.ayushsapplication.app.modules.choosecreditordebitcard.`data`.model.ImageSliderCreditCardModel
import com.ayushsapplication.app.modules.choosecreditordebitcard.`data`.viewmodel.ChooseCreditOrDebitCardVM
import com.ayushsapplication.app.modules.successscreen.ui.SuccessScreenActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ChooseCreditOrDebitCardActivity :
    BaseActivity<ActivityChooseCreditOrDebitCardBinding>(R.layout.activity_choose_credit_or_debit_card)
    {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.ayushsapplication.app/drawable/img_user")


  private val imageSliderCreditCardItems: ArrayList<ImageSliderCreditCardModel> =
      arrayListOf(ImageSliderCreditCardModel(imageUser =
  imageUri.toString()),ImageSliderCreditCardModel(imageUser = imageUri.toString()))


  private val viewModel: ChooseCreditOrDebitCardVM by viewModels<ChooseCreditOrDebitCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val creditCardAdapter = CreditCardAdapter(imageSliderCreditCardItems,true)
    binding.imageSliderCreditCard.adapter = creditCardAdapter
    binding.imageSliderCreditCard.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorSettings.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSettings.updateIndicatorCounts(binding.imageSliderCreditCard.indicatorCount)
    binding.chooseCreditOrDebitCardVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderCreditCard.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderCreditCard.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
    binding.btnPayButton.setOnClickListener {
      val destIntent = SuccessScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHOOSE_CREDIT_OR_DEBIT_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChooseCreditOrDebitCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
