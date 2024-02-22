package com.ayushsapplication.app.modules.cart.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CartRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirZoomPegasus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_pegasus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
