package com.ayushsapplication.app.modules.orderdetails.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OrderDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPacking: String? = MyApp.getInstance().resources.getString(R.string.lbl_packing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArriving: String? = MyApp.getInstance().resources.getString(R.string.lbl_arriving)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingDetails: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPOSReggular: String? =
      MyApp.getInstance().resources.getString(R.string.msg_january_16_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPOSReggular1: String? = MyApp.getInstance().resources.getString(R.string.lbl_pos_reggular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText2: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_resi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPOSReggular2: String? = MyApp.getInstance().resources.getString(R.string.lbl_000192848573)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText3: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPOSReggular3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2727_new_owerri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText4: String? = MyApp.getInstance().resources.getString(R.string.lbl_items_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceText: String? = MyApp.getInstance().resources.getString(R.string.lbl_598_86)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText5: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingText6: String? =
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
  var txtShippingText7: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceText3: String? = MyApp.getInstance().resources.getString(R.string.lbl_766_86)

)
