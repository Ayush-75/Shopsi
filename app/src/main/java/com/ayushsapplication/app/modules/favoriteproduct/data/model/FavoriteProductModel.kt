package com.ayushsapplication.app.modules.favoriteproduct.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavoriteProductModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFavoriteProduct: String? =
      MyApp.getInstance().resources.getString(R.string.msg_favorite_product)

)
