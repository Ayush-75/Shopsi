package com.ayushsapplication.app.modules.creditcardanddebit.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushsapplication.app.R
import com.ayushsapplication.app.databinding.RowCreditcarditemsBinding
import com.ayushsapplication.app.modules.creditcardanddebit.`data`.model.CreditcarditemsRowModel
import kotlin.Int
import kotlin.collections.List

class CreditCardItemsAdapter(
  var list: List<CreditcarditemsRowModel>
) : RecyclerView.Adapter<CreditCardItemsAdapter.RowCreditcarditemsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCreditcarditemsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_creditcarditems,parent,false)
    return RowCreditcarditemsVH(view)
  }

  override fun onBindViewHolder(holder: RowCreditcarditemsVH, position: Int) {
    val creditcarditemsRowModel = CreditcarditemsRowModel()
    // TODO uncomment following line after integration with data source
    // val creditcarditemsRowModel = list[position]
    holder.binding.creditcarditemsRowModel = creditcarditemsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CreditcarditemsRowModel>) {
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
      item: CreditcarditemsRowModel
    ) {
    }
  }

  inner class RowCreditcarditemsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCreditcarditemsBinding = RowCreditcarditemsBinding.bind(itemView)
    init {
      binding.linearCreditCardItem.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CreditcarditemsRowModel())
      }
    }
  }
}
