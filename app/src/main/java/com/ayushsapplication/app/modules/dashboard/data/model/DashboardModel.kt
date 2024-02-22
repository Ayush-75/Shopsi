package com.ayushsapplication.app.modules.dashboard.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlashSaleText: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeMoreText: String? = MyApp.getInstance().resources.getString(R.string.lbl_more_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlashSaleText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_flash_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeMoreText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlashSaleText2: String? = MyApp.getInstance().resources.getString(R.string.lbl_mega_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeMoreText2: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)

)
