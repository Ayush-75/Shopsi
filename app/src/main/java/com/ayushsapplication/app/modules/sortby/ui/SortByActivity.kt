package com.ayushsapplication.app.modules.sortby.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivitySortByBinding
import com.ayushsapplication.app.modules.sortby.`data`.viewmodel.SortByVM
import kotlin.String
import kotlin.Unit

class SortByActivity : BaseActivity<ActivitySortByBinding>(R.layout.activity_sort_by) {
  private val viewModel: SortByVM by viewModels<SortByVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sortByVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SORT_BY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SortByActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
