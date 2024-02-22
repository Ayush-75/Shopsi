package com.ayushsapplication.app.modules.filter.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilterSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceRange: String? = MyApp.getInstance().resources.getString(R.string.lbl_price_range)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCondition: String? = MyApp.getInstance().resources.getString(R.string.lbl_condition)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyingFormat: String? = MyApp.getInstance().resources.getString(R.string.lbl_buying_format)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowOnly: String? = MyApp.getInstance().resources.getString(R.string.lbl_show_only)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPrice1Value: String? = null
)
