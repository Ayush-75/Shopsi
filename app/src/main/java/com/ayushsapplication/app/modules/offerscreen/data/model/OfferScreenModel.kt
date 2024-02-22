package com.ayushsapplication.app.modules.offerscreen.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OfferScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer1: String? = MyApp.getInstance().resources.getString(R.string.msg_use_megsl_cupon)

)
