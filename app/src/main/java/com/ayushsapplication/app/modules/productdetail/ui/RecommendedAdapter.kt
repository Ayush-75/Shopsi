package com.ayushsapplication.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushsapplication.app.R
import com.ayushsapplication.app.databinding.RowRecommendedBinding
import com.ayushsapplication.app.modules.productdetail.`data`.model.RecommendedRowModel
import kotlin.Int
import kotlin.collections.List

class RecommendedAdapter(
  var list: List<RecommendedRowModel>
) : RecyclerView.Adapter<RecommendedAdapter.RowRecommendedVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRecommendedVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_recommended,parent,false)
    return RowRecommendedVH(view)
  }

  override fun onBindViewHolder(holder: RowRecommendedVH, position: Int) {
    val recommendedRowModel = RecommendedRowModel()
    // TODO uncomment following line after integration with data source
    // val recommendedRowModel = list[position]
    holder.binding.recommendedRowModel = recommendedRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RecommendedRowModel>) {
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
      item: RecommendedRowModel
    ) {
    }
  }

  inner class RowRecommendedVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRecommendedBinding = RowRecommendedBinding.bind(itemView)
  }
}
