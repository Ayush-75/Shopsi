package com.ayushsapplication.app.modules.cart.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText: String? = MyApp.getInstance().resources.getString(R.string.lbl_items_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceText: String? = MyApp.getInstance().resources.getString(R.string.lbl_598_86)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_import_charges)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceText2: String? = MyApp.getInstance().resources.getString(R.string.lbl_128_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText3: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceText3: String? = MyApp.getInstance().resources.getString(R.string.lbl_766_86)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCuponCodeValue: String? = null
)
