package com.ayushsapplication.app.modules.productdetail.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirMaxRea: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_2702)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductName: String? =
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
  var txtSelectSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_color)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpecification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_specification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStyleText: String? = MyApp.getInstance().resources.getString(R.string.lbl_shown)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStyleCodeText: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laser_blue_anth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStyleText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_style)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStyleCodeText1: String? = MyApp.getInstance().resources.getString(R.string.lbl_cd0113_400)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_nike_air_max)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStyleText2: String? = MyApp.getInstance().resources.getString(R.string.lbl_review_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStyleCodeText2: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRattings: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewCount: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJamesLawson: String? = MyApp.getInstance().resources.getString(R.string.lbl_james_lawson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_always)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_2016)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouMightAlsoLike: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_might_also_like)

)
