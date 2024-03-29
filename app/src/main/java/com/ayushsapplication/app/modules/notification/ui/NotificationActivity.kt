package com.ayushsapplication.app.modules.notification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityNotificationBinding
import com.ayushsapplication.app.modules.notification.`data`.viewmodel.NotificationVM
import com.ayushsapplication.app.modules.notificationactivity.ui.NotificationActivityActivity
import com.ayushsapplication.app.modules.notificationfeed.ui.NotificationFeedActivity
import com.ayushsapplication.app.modules.notificationoffer.ui.NotificationOfferActivity
import kotlin.String
import kotlin.Unit

class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
    binding.linearNotificationOptionRow1.setOnClickListener {
      val destIntent = NotificationFeedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotificationOptionRow2.setOnClickListener {
      val destIntent = NotificationActivityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotificationOptionRow.setOnClickListener {
      val destIntent = NotificationOfferActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
