package com.ayushsapplication.app.modules.orderdetails.ui

import android.view.View
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityOrderDetailsBinding
import com.ayushsapplication.app.modules.orderdetails.`data`.model.ProductlistRowModel
import com.ayushsapplication.app.modules.orderdetails.`data`.viewmodel.OrderDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrderDetailsActivity :
    BaseActivity<ActivityOrderDetailsBinding>(R.layout.activity_order_details) {
  private val viewModel: OrderDetailsVM by viewModels<OrderDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val productListAdapter =
    ProductListAdapter(viewModel.productListList.value?:mutableListOf())
    binding.recyclerProductList.adapter = productListAdapter
    productListAdapter.setOnItemClickListener(
    object : ProductListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductlistRowModel) {
        onClickRecyclerProductList(view, position, item)
      }
    }
    )
    viewModel.productListList.observe(this) {
      productListAdapter.updateData(it)
    }
    binding.orderDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerProductList(
    view: View,
    position: Int,
    item: ProductlistRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORDER_DETAILS_ACTIVITY"

  }
}
