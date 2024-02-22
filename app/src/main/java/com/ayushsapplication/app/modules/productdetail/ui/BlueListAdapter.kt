package com.ayushsapplication.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushsapplication.app.R
import com.ayushsapplication.app.databinding.RowBluelistBinding
import com.ayushsapplication.app.modules.productdetail.`data`.model.BluelistRowModel
import kotlin.Int
import kotlin.collections.List

class BlueListAdapter(
  var list: List<BluelistRowModel>
) : RecyclerView.Adapter<BlueListAdapter.RowBluelistVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBluelistVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_bluelist,parent,false)
    return RowBluelistVH(view)
  }

  override fun onBindViewHolder(holder: RowBluelistVH, position: Int) {
    val bluelistRowModel = BluelistRowModel()
    // TODO uncomment following line after integration with data source
    // val bluelistRowModel = list[position]
    holder.binding.bluelistRowModel = bluelistRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BluelistRowModel>) {
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
      item: BluelistRowModel
    ) {
    }
  }

  inner class RowBluelistVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBluelistBinding = RowBluelistBinding.bind(itemView)
  }
}
