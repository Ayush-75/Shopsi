package com.ayushsapplication.app.modules.changepassword.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChangePasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_old_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPasswordAgain: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_password_again)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNewPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNewPasswordAgainValue: String? = null
)
