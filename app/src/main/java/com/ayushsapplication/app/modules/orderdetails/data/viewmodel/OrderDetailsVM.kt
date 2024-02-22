package com.ayushsapplication.app.modules.orderdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ayushsapplication.app.modules.orderdetails.`data`.model.OrderDetailsModel
import com.ayushsapplication.app.modules.orderdetails.`data`.model.ProductlistRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrderDetailsVM : ViewModel(), KoinComponent {
  val orderDetailsModel: MutableLiveData<OrderDetailsModel> = MutableLiveData(OrderDetailsModel())

  var navArguments: Bundle? = null

  val productListList: MutableLiveData<MutableList<ProductlistRowModel>> =
      MutableLiveData(mutableListOf())
}
