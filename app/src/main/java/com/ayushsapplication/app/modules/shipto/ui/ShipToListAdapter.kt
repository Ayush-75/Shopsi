package com.ayushsapplication.app.modules.shipto.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushsapplication.app.R
import com.ayushsapplication.app.databinding.RowShiptolistBinding
import com.ayushsapplication.app.modules.shipto.`data`.model.ShiptolistRowModel
import kotlin.Int
import kotlin.collections.List

class ShipToListAdapter(
  var list: List<ShiptolistRowModel>
) : RecyclerView.Adapter<ShipToListAdapter.RowShiptolistVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowShiptolistVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_shiptolist,parent,false)
    return RowShiptolistVH(view)
  }

  override fun onBindViewHolder(holder: RowShiptolistVH, position: Int) {
    val shiptolistRowModel = ShiptolistRowModel()
    // TODO uncomment following line after integration with data source
    // val shiptolistRowModel = list[position]
    holder.binding.shiptolistRowModel = shiptolistRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ShiptolistRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ShiptolistRowModel
    ) {
    }
  }

  inner class RowShiptolistVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowShiptolistBinding = RowShiptolistBinding.bind(itemView)
  }
}
