package com.ayushsapplication.app.modules.choosecreditordebitcard.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChooseCreditOrDebitCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_choose_card)

)
