package com.ayushsapplication.app.modules.listcategory.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_bikini)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText2: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText3: String? = MyApp.getInstance().resources.getString(R.string.lbl_work_equipment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText4: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_pants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText5: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText6: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_underwear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText7: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_t_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText8: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText9: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_pants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikiniText10: String? = MyApp.getInstance().resources.getString(R.string.lbl_high_heels)

)
