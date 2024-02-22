package com.ayushsapplication.app.modules.addpayment.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddPaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaypalText: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_or_debit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaypalText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_paypal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaypalText2: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_transfer)

)
