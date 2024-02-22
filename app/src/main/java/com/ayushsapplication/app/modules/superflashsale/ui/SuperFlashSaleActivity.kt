package com.ayushsapplication.app.modules.superflashsale.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivitySuperFlashSaleBinding
import com.ayushsapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.ayushsapplication.app.modules.search.ui.SearchActivity
import com.ayushsapplication.app.modules.superflashsale.`data`.model.SuperflashsaleRowModel
import com.ayushsapplication.app.modules.superflashsale.`data`.viewmodel.SuperFlashSaleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SuperFlashSaleActivity :
    BaseActivity<ActivitySuperFlashSaleBinding>(R.layout.activity_super_flash_sale) {
  private val viewModel: SuperFlashSaleVM by viewModels<SuperFlashSaleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val superFlashSaleAdapter =
    SuperFlashSaleAdapter(viewModel.superFlashSaleList.value?:mutableListOf())
    binding.recyclerSuperFlashSale.adapter = superFlashSaleAdapter
    superFlashSaleAdapter.setOnItemClickListener(
    object : SuperFlashSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SuperflashsaleRowModel) {
        onClickRecyclerSuperFlashSale(view, position, item)
      }
    }
    )
    viewModel.superFlashSaleList.observe(this) {
      superFlashSaleAdapter.updateData(it)
    }
    binding.superFlashSaleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
    binding.imageSearchIcon.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSuperFlashSale(
    view: View,
    position: Int,
    item: SuperflashsaleRowModel
  ): Unit {
    when(view.id) {
      R.id.linearProductItem ->  {
        val destIntent = ProductDetailActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "SUPER_FLASH_SALE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SuperFlashSaleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
