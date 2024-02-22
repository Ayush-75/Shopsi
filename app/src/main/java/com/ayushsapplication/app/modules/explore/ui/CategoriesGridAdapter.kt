package com.ayushsapplication.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushsapplication.app.R
import com.ayushsapplication.app.databinding.RowCategoriesgridBinding
import com.ayushsapplication.app.modules.explore.`data`.model.CategoriesgridRowModel
import kotlin.Int
import kotlin.collections.List

class CategoriesGridAdapter(
  var list: List<CategoriesgridRowModel>
) : RecyclerView.Adapter<CategoriesGridAdapter.RowCategoriesgridVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCategoriesgridVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_categoriesgrid,parent,false)
    return RowCategoriesgridVH(view)
  }

  override fun onBindViewHolder(holder: RowCategoriesgridVH, position: Int) {
    val categoriesgridRowModel = CategoriesgridRowModel()
    // TODO uncomment following line after integration with data source
    // val categoriesgridRowModel = list[position]
    holder.binding.categoriesgridRowModel = categoriesgridRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CategoriesgridRowModel>) {
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
      item: CategoriesgridRowModel
    ) {
    }
  }

  inner class RowCategoriesgridVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCategoriesgridBinding = RowCategoriesgridBinding.bind(itemView)
  }
}
