package com.ayushsapplication.app.modules.addaddress.ui

import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityAddAddressBinding
import com.ayushsapplication.app.modules.addaddress.`data`.viewmodel.AddAddressVM
import kotlin.String
import kotlin.Unit

class AddAddressActivity : BaseActivity<ActivityAddAddressBinding>(R.layout.activity_add_address) {
  private val viewModel: AddAddressVM by viewModels<AddAddressVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addAddressVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_ADDRESS_ACTIVITY"

  }
}
