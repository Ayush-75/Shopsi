package com.ayushsapplication.app.modules.filter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityFilterBinding
import com.ayushsapplication.app.modules.filter.`data`.viewmodel.FilterVM
import com.ayushsapplication.app.modules.searchresult.ui.SearchResultActivity
import kotlin.String
import kotlin.Unit

class FilterActivity : BaseActivity<ActivityFilterBinding>(R.layout.activity_filter) {
  private val viewModel: FilterVM by viewModels<FilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnApplyButton.setOnClickListener {
      val destIntent = SearchResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FILTER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
