package com.ayushsapplication.app.modules.favoriteproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityFavoriteProductBinding
import com.ayushsapplication.app.modules.favoriteproduct.`data`.model.FavoriteproductRowModel
import com.ayushsapplication.app.modules.favoriteproduct.`data`.viewmodel.FavoriteProductVM
import com.ayushsapplication.app.modules.productdetail.ui.ProductDetailActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FavoriteProductActivity :
    BaseActivity<ActivityFavoriteProductBinding>(R.layout.activity_favorite_product) {
  private val viewModel: FavoriteProductVM by viewModels<FavoriteProductVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val favoriteProductAdapter =
    FavoriteProductAdapter(viewModel.favoriteProductList.value?:mutableListOf())
    binding.recyclerFavoriteProduct.adapter = favoriteProductAdapter
    favoriteProductAdapter.setOnItemClickListener(
    object : FavoriteProductAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FavoriteproductRowModel) {
        onClickRecyclerFavoriteProduct(view, position, item)
      }
    }
    )
    viewModel.favoriteProductList.observe(this) {
      favoriteProductAdapter.updateData(it)
    }
    binding.favoriteProductVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerFavoriteProduct(
    view: View,
    position: Int,
    item: FavoriteproductRowModel
  ): Unit {
    when(view.id) {
      R.id.linearProductItem ->  {
        val destIntent = ProductDetailActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "FAVORITE_PRODUCT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoriteProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
