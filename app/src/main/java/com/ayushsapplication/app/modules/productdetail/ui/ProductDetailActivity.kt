package com.ayushsapplication.app.modules.productdetail.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityProductDetailBinding
import com.ayushsapplication.app.modules.productdetail.`data`.model.BluelistRowModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.ImageSliderWidgetModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.Products1RowModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.RecommendedRowModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.SizesRowModel
import com.ayushsapplication.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import com.ayushsapplication.app.modules.reviewproduct.ui.ReviewProductActivity
import com.ayushsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ProductDetailActivity :
    BaseActivity<ActivityProductDetailBinding>(R.layout.activity_product_detail) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.ayushsapplication.app/drawable/img_product_image_238x375")


  private val imageSliderWidgetItems: ArrayList<ImageSliderWidgetModel> =
      arrayListOf(ImageSliderWidgetModel(imageProductImage =
  imageUri.toString()),ImageSliderWidgetModel(imageProductImage = imageUri.toString()))


  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val widgetAdapter = WidgetAdapter(imageSliderWidgetItems,true)
    binding.imageSliderWidget.adapter = widgetAdapter
    binding.imageSliderWidget.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorSettings.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSettings.updateIndicatorCounts(binding.imageSliderWidget.indicatorCount)
    val sizesAdapter = SizesAdapter(viewModel.sizesList.value?:mutableListOf())
    binding.recyclerSizes.adapter = sizesAdapter
    sizesAdapter.setOnItemClickListener(
    object : SizesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SizesRowModel) {
        onClickRecyclerSizes(view, position, item)
      }
    }
    )
    viewModel.sizesList.observe(this) {
      sizesAdapter.updateData(it)
    }
    val blueListAdapter = BlueListAdapter(viewModel.blueListList.value?:mutableListOf())
    binding.recyclerBlueList.adapter = blueListAdapter
    blueListAdapter.setOnItemClickListener(
    object : BlueListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BluelistRowModel) {
        onClickRecyclerBlueList(view, position, item)
      }
    }
    )
    viewModel.blueListList.observe(this) {
      blueListAdapter.updateData(it)
    }
    val productsAdapter = ProductsAdapter(viewModel.productsList.value?:mutableListOf())
    binding.recyclerProducts.adapter = productsAdapter
    productsAdapter.setOnItemClickListener(
    object : ProductsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Products1RowModel) {
        onClickRecyclerProducts(view, position, item)
      }
    }
    )
    viewModel.productsList.observe(this) {
      productsAdapter.updateData(it)
    }
    val recommendedAdapter =
    RecommendedAdapter(viewModel.recommendedList.value?:mutableListOf())
    binding.recyclerRecommended.adapter = recommendedAdapter
    recommendedAdapter.setOnItemClickListener(
    object : RecommendedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RecommendedRowModel) {
        onClickRecyclerRecommended(view, position, item)
      }
    }
    )
    viewModel.recommendedList.observe(this) {
      recommendedAdapter.updateData(it)
    }
    binding.productDetailVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderWidget.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderWidget.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
    binding.imageSearchIcon.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtStyleCodeText2.setOnClickListener {
      val destIntent = ReviewProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSizes(
    view: View,
    position: Int,
    item: SizesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerBlueList(
    view: View,
    position: Int,
    item: BluelistRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerProducts(
    view: View,
    position: Int,
    item: Products1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerRecommended(
    view: View,
    position: Int,
    item: RecommendedRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
