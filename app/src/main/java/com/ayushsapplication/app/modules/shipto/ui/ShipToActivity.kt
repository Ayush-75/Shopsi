package com.ayushsapplication.app.modules.shipto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseActivity
import com.ayushsapplication.app.databinding.ActivityShipToBinding
import com.ayushsapplication.app.modules.paymentmethod.ui.PaymentMethodActivity
import com.ayushsapplication.app.modules.shipto.`data`.model.ShiptolistRowModel
import com.ayushsapplication.app.modules.shipto.`data`.viewmodel.ShipToVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ShipToActivity : BaseActivity<ActivityShipToBinding>(R.layout.activity_ship_to) {
  private val viewModel: ShipToVM by viewModels<ShipToVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val shipToListAdapter = ShipToListAdapter(viewModel.shipToListList.value?:mutableListOf())
    binding.recyclerShipToList.adapter = shipToListAdapter
    shipToListAdapter.setOnItemClickListener(
    object : ShipToListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ShiptolistRowModel) {
        onClickRecyclerShipToList(view, position, item)
      }
    }
    )
    viewModel.shipToListList.observe(this) {
      shipToListAdapter.updateData(it)
    }
    binding.shipToVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNextButton.setOnClickListener {
      val destIntent = PaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerShipToList(
    view: View,
    position: Int,
    item: ShiptolistRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SHIP_TO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShipToActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
