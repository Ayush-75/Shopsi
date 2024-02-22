package com.ayushsapplication.app.modules.successscreen.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SuccessScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThankYouForShopping: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_shopping)

)
