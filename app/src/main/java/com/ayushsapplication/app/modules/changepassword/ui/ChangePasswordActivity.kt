package com.ayushsapplication.app.modules.changepassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityChangePasswordBinding
import com.ayushsapplication.app.modules.changepassword.`data`.viewmodel.ChangePasswordVM
import kotlin.String
import kotlin.Unit

class ChangePasswordActivity :
    BaseActivity<ActivityChangePasswordBinding>(R.layout.activity_change_password) {
  private val viewModel: ChangePasswordVM by viewModels<ChangePasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.changePasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHANGE_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChangePasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
