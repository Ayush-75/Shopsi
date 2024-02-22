package com.ayushsapplication.app.modules.notificationfeed.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityNotificationFeedBinding
import com.ayushsapplication.app.modules.notificationfeed.`data`.viewmodel.NotificationFeedVM
import kotlin.String
import kotlin.Unit

class NotificationFeedActivity :
    BaseActivity<ActivityNotificationFeedBinding>(R.layout.activity_notification_feed) {
  private val viewModel: NotificationFeedVM by viewModels<NotificationFeedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationFeedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_FEED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationFeedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
