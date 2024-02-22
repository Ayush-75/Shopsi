package com.ayushsapplication.app.modules.productdetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.BluelistRowModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.ProductDetailModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.Products1RowModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.RecommendedRowModel
import com.ayushsapplication.app.modules.productdetail.`data`.model.SizesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProductDetailVM : ViewModel(), KoinComponent {
  val productDetailModel: MutableLiveData<ProductDetailModel> =
      MutableLiveData(ProductDetailModel())

  var navArguments: Bundle? = null

  val sizesList: MutableLiveData<MutableList<SizesRowModel>> = MutableLiveData(mutableListOf())

  val blueListList: MutableLiveData<MutableList<BluelistRowModel>> =
      MutableLiveData(mutableListOf())

  val productsList: MutableLiveData<MutableList<Products1RowModel>> =
      MutableLiveData(mutableListOf())

  val recommendedList: MutableLiveData<MutableList<RecommendedRowModel>> =
      MutableLiveData(mutableListOf())
}
