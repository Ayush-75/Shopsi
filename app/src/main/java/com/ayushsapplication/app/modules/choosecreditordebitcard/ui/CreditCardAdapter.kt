package com.ayushsapplication.app.modules.choosecreditordebitcard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.ayushsapplication.app.databinding.SlideritemChooseCreditOrDebitCard1Binding
import com.ayushsapplication.app.modules.choosecreditordebitcard.`data`.model.ImageSliderCreditCardModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class CreditCardAdapter(
  val dataList: ArrayList<ImageSliderCreditCardModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderCreditCardModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemChooseCreditOrDebitCard1Binding) {
      binding.imageSliderCreditCardModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemChooseCreditOrDebitCard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
