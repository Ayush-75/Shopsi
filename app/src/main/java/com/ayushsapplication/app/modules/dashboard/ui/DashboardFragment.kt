package com.ayushsapplication.app.modules.dashboard.ui

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseFragment
import com.ayushsapplication.app.databinding.FragmentDashboardBinding
import com.ayushsapplication.app.modules.dashboard.`data`.model.ArrightRowModel
import com.ayushsapplication.app.modules.dashboard.`data`.model.FlashsaleRowModel
import com.ayushsapplication.app.modules.dashboard.`data`.model.ImageSliderOfferBannerModel
import com.ayushsapplication.app.modules.dashboard.`data`.model.MegasaleRowModel
import com.ayushsapplication.app.modules.dashboard.`data`.model.ProductsRowModel
import com.ayushsapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.ayushsapplication.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.ayushsapplication.app.modules.listcategory.ui.ListCategoryActivity
import com.ayushsapplication.app.modules.notification.ui.NotificationActivity
import com.ayushsapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.ayushsapplication.app.modules.search.ui.SearchActivity
import com.ayushsapplication.app.modules.superflashsale.ui.SuperFlashSaleActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(R.layout.fragment_dashboard) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.ayushsapplication.app/drawable/img_promotion_image")


  private val imageSliderOfferBannerItems: ArrayList<ImageSliderOfferBannerModel> =
      arrayListOf(ImageSliderOfferBannerModel(imagePromotionImage =
  imageUri.toString()),ImageSliderOfferBannerModel(imagePromotionImage =
  imageUri.toString()))


  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val offerBannerAdapter = OfferBannerAdapter(imageSliderOfferBannerItems,true)
    binding.imageSliderOfferBanner.adapter = offerBannerAdapter
    binding.imageSliderOfferBanner.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorSettings.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSettings.updateIndicatorCounts(binding.imageSliderOfferBanner.indicatorCount)
    val arrowRightAdapter = ArrowRightAdapter(viewModel.arrowRightList.value?:mutableListOf())
    binding.recyclerArrowRight.adapter = arrowRightAdapter
    arrowRightAdapter.setOnItemClickListener(
    object : ArrowRightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ArrightRowModel) {
        onClickRecyclerArrowRight(view, position, item)
      }
    }
    )
    viewModel.arrowRightList.observe(requireActivity()) {
      arrowRightAdapter.updateData(it)
    }
    val flashSaleAdapter = FlashSaleAdapter(viewModel.flashSaleList.value?:mutableListOf())
    binding.recyclerFlashSale.adapter = flashSaleAdapter
    flashSaleAdapter.setOnItemClickListener(
    object : FlashSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FlashsaleRowModel) {
        onClickRecyclerFlashSale(view, position, item)
      }
    }
    )
    viewModel.flashSaleList.observe(requireActivity()) {
      flashSaleAdapter.updateData(it)
    }
    val megaSaleAdapter = MegaSaleAdapter(viewModel.megaSaleList.value?:mutableListOf())
    binding.recyclerMegaSale.adapter = megaSaleAdapter
    megaSaleAdapter.setOnItemClickListener(
    object : MegaSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MegasaleRowModel) {
        onClickRecyclerMegaSale(view, position, item)
      }
    }
    )
    viewModel.megaSaleList.observe(requireActivity()) {
      megaSaleAdapter.updateData(it)
    }
    val productsAdapter = ProductsAdapter(viewModel.productsList.value?:mutableListOf())
    binding.recyclerProducts.adapter = productsAdapter
    productsAdapter.setOnItemClickListener(
    object : ProductsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductsRowModel) {
        onClickRecyclerProducts(view, position, item)
      }
    }
    )
    viewModel.productsList.observe(requireActivity()) {
      productsAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderOfferBanner.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderOfferBanner.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.linearFlashSaleHeader1.setOnClickListener {
      val destIntent = SuperFlashSaleActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.txtSeeMoreText.setOnClickListener {
      val destIntent = ListCategoryActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageLoveIcon.setOnClickListener {
      val destIntent = FavoriteProductActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.txtSearchProduct.setOnClickListener {
      val destIntent = SearchActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageNotificationIcon.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerArrowRight(
    view: View,
    position: Int,
    item: ArrightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerFlashSale(
    view: View,
    position: Int,
    item: FlashsaleRowModel
  ): Unit {
    when(view.id) {
      R.id.linearProductItem ->  {
        val destIntent = ProductDetailActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  fun onClickRecyclerMegaSale(
    view: View,
    position: Int,
    item: MegasaleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerProducts(
    view: View,
    position: Int,
    item: ProductsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_FRAGMENT"


    fun getInstance(bundle: Bundle?): DashboardFragment {
      val fragment = DashboardFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
