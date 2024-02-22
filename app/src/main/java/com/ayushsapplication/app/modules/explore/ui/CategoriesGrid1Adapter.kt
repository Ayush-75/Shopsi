package com.ayushsapplication.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushsapplication.app.R
import com.ayushsapplication.app.databinding.RowCategoriesgrid1Binding
import com.ayushsapplication.app.modules.explore.`data`.model.Categoriesgrid1RowModel
import kotlin.Int
import kotlin.collections.List

class CategoriesGrid1Adapter(
  var list: List<Categoriesgrid1RowModel>
) : RecyclerView.Adapter<CategoriesGrid1Adapter.RowCategoriesgrid1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCategoriesgrid1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_categoriesgrid1,parent,false)
    return RowCategoriesgrid1VH(view)
  }

  override fun onBindViewHolder(holder: RowCategoriesgrid1VH, position: Int) {
    val categoriesgrid1RowModel = Categoriesgrid1RowModel()
    // TODO uncomment following line after integration with data source
    // val categoriesgrid1RowModel = list[position]
    holder.binding.categoriesgrid1RowModel = categoriesgrid1RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Categoriesgrid1RowModel>) {
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
      item: Categoriesgrid1RowModel
    ) {
    }
  }

  inner class RowCategoriesgrid1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCategoriesgrid1Binding = RowCategoriesgrid1Binding.bind(itemView)
  }
}
