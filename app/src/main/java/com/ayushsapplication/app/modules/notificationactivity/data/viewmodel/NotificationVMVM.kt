package com.ayushsapplication.app.modules.notificationactivity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ayushsapplication.app.modules.notificationactivity.`data`.model.NotificationModelModel
import org.koin.core.KoinComponent

class NotificationVMVM : ViewModel(), KoinComponent {
  val notificationModelModel: MutableLiveData<NotificationModelModel> =
      MutableLiveData(NotificationModelModel())

  var navArguments: Bundle? = null
}
