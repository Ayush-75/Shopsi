package com.ayushsapplication.app.modules.shipto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ayushsapplication.app.modules.shipto.`data`.model.ShipToModel
import com.ayushsapplication.app.modules.shipto.`data`.model.ShiptolistRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ShipToVM : ViewModel(), KoinComponent {
  val shipToModel: MutableLiveData<ShipToModel> = MutableLiveData(ShipToModel())

  var navArguments: Bundle? = null

  val shipToListList: MutableLiveData<MutableList<ShiptolistRowModel>> =
      MutableLiveData(mutableListOf())
}
