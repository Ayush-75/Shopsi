package com.ayushsapplication.app.modules.orderdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushsapplication.app.R
import com.ayushsapplication.app.databinding.RowProductlistBinding
import com.ayushsapplication.app.modules.orderdetails.`data`.model.ProductlistRowModel
import kotlin.Int
import kotlin.collections.List

class ProductListAdapter(
  var list: List<ProductlistRowModel>
) : RecyclerView.Adapter<ProductListAdapter.RowProductlistVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductlistVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_productlist,parent,false)
    return RowProductlistVH(view)
  }

  override fun onBindViewHolder(holder: RowProductlistVH, position: Int) {
    val productlistRowModel = ProductlistRowModel()
    // TODO uncomment following line after integration with data source
    // val productlistRowModel = list[position]
    holder.binding.productlistRowModel = productlistRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProductlistRowModel>) {
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
      item: ProductlistRowModel
    ) {
    }
  }

  inner class RowProductlistVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProductlistBinding = RowProductlistBinding.bind(itemView)
  }
}
