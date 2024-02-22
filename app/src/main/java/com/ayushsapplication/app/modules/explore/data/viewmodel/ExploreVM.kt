package com.ayushsapplication.app.modules.explore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ayushsapplication.app.modules.explore.`data`.model.Categoriesgrid1RowModel
import com.ayushsapplication.app.modules.explore.`data`.model.CategoriesgridRowModel
import com.ayushsapplication.app.modules.explore.`data`.model.ExploreModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExploreVM : ViewModel(), KoinComponent {
  val exploreModel: MutableLiveData<ExploreModel> = MutableLiveData(ExploreModel())

  var navArguments: Bundle? = null

  val categoriesGridList: MutableLiveData<MutableList<CategoriesgridRowModel>> =
      MutableLiveData(mutableListOf())

  val categoriesGrid1List: MutableLiveData<MutableList<Categoriesgrid1RowModel>> =
      MutableLiveData(mutableListOf())
}
