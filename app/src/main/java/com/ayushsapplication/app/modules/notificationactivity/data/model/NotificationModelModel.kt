package com.ayushsapplication.app.modules.notificationactivity.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModelModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionTitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_nike)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_consectetur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionTime: String? =
      MyApp.getInstance().resources.getString(R.string.msg_april_30_2014_1_01)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionTitle1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_nike2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_consectetur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionTime1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_april_30_2014_1_01)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionTitle2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_nike3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionDescription2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_consectetur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionTime2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_april_30_2014_1_01)

)
