package com.ayushsapplication.app.modules.explore.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtManFashion: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_fashion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomanFashion: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_fashion)

)
