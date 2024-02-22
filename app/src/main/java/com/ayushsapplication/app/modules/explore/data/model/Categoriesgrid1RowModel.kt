package com.ayushsapplication.app.modules.explore.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Categoriesgrid1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_shirt)

)
