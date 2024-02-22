package com.ayushsapplication.app.network.repository

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import com.ayushsapplication.app.extensions.NoInternetConnection
import com.ayushsapplication.app.extensions.isOnline
import com.ayushsapplication.app.network.RetrofitServices
import com.ayushsapplication.app.network.models.createlogin.CreateLoginRequest
import com.ayushsapplication.app.network.models.createlogin.CreateLoginResponse
import com.ayushsapplication.app.network.models.createregister.CreateRegisterRequest
import com.ayushsapplication.app.network.models.createregister.CreateRegisterResponse
import com.ayushsapplication.app.network.models.fetchme.FetchMeResponse
import com.ayushsapplication.app.network.resources.ErrorResponse
import com.ayushsapplication.app.network.resources.Response
import com.ayushsapplication.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import org.koin.core.KoinComponent
import org.koin.core.inject

class NetworkRepository : KoinComponent {
  private val retrofitServices: RetrofitServices by inject()

  private val errorMessage: String = "Something went wrong."

  suspend fun fetchMe(contentType: String?, authorization: String?): Response<FetchMeResponse> =
      try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.fetchMe(contentType, authorization))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }

  suspend fun createLogin(contentType: String?, createLoginRequest: CreateLoginRequest?):
      Response<CreateLoginResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createLogin(contentType, createLoginRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }

  suspend fun createRegister(contentType: String?, createRegisterRequest: CreateRegisterRequest?):
      Response<CreateRegisterResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createRegister(contentType, createRegisterRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }
}
