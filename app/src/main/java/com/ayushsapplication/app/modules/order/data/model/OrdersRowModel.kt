package com.ayushsapplication.app.modules.order.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OrdersRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_sdg1345kjd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.msg_order_at_e_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderStatus: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPurchasedCount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_items_purchased)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice3: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)

)
