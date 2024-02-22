package com.ayushsapplication.app.modules.explore.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.base.BaseFragment
import com.ayushsapplication.app.databinding.FragmentExploreBinding
import com.ayushsapplication.app.modules.explore.`data`.model.Categoriesgrid1RowModel
import com.ayushsapplication.app.modules.explore.`data`.model.CategoriesgridRowModel
import com.ayushsapplication.app.modules.explore.`data`.viewmodel.ExploreVM
import com.ayushsapplication.app.modules.notification.ui.NotificationActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExploreFragment : BaseFragment<FragmentExploreBinding>(R.layout.fragment_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val categoriesGridAdapter =
    CategoriesGridAdapter(viewModel.categoriesGridList.value?:mutableListOf())
    binding.recyclerCategoriesGrid.adapter = categoriesGridAdapter
    categoriesGridAdapter.setOnItemClickListener(
    object : CategoriesGridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CategoriesgridRowModel) {
        onClickRecyclerCategoriesGrid(view, position, item)
      }
    }
    )
    viewModel.categoriesGridList.observe(requireActivity()) {
      categoriesGridAdapter.updateData(it)
    }
    val categoriesGrid1Adapter =
    CategoriesGrid1Adapter(viewModel.categoriesGrid1List.value?:mutableListOf())
    binding.recyclerCategoriesGrid1.adapter = categoriesGrid1Adapter
    categoriesGrid1Adapter.setOnItemClickListener(
    object : CategoriesGrid1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Categoriesgrid1RowModel) {
        onClickRecyclerCategoriesGrid1(view, position, item)
      }
    }
    )
    viewModel.categoriesGrid1List.observe(requireActivity()) {
      categoriesGrid1Adapter.updateData(it)
    }
    binding.exploreVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageNotificationIcon.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerCategoriesGrid(
    view: View,
    position: Int,
    item: CategoriesgridRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerCategoriesGrid1(
    view: View,
    position: Int,
    item: Categoriesgrid1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "EXPLORE_FRAGMENT"


      fun getInstance(bundle: Bundle?): ExploreFragment {
        val fragment = ExploreFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
