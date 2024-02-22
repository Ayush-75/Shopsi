package com.ayushsapplication.app.modules.searchresultnodatafound.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultNoDataFoundModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResultCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductNotFound: String? =
      MyApp.getInstance().resources.getString(R.string.msg_product_not_found)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThankYouForShopping: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_shopping)

)
