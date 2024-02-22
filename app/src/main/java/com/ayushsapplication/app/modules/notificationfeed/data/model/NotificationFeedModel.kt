package com.ayushsapplication.app.modules.notificationfeed.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationFeedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestProductText: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_pegasus2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateText: String? = MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5_06)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestProductText1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_best_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_pegasus2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateText1: String? = MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5_06)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestProductText2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductDescription2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_pegasus2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateText2: String? = MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5_06)

)
