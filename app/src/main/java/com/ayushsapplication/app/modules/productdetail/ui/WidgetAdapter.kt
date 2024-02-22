package com.ayushsapplication.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.ayushsapplication.app.databinding.SlideritemProductDetail1Binding
import com.ayushsapplication.app.modules.productdetail.`data`.model.ImageSliderWidgetModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class WidgetAdapter(
  val dataList: ArrayList<ImageSliderWidgetModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderWidgetModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemProductDetail1Binding) {
      binding.imageSliderWidgetModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemProductDetail1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
