package com.ayushsapplication.app.modules.explore.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriesgridRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOfficeBag: String? = MyApp.getInstance().resources.getString(R.string.lbl_office_bag)

)
