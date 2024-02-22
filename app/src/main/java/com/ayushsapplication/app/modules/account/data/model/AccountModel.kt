package com.ayushsapplication.app.modules.account.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder1: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder2: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder3: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)

)
