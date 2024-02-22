package com.ayushsapplication.app.modules.creditcardanddebit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ayushsapplication.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebitModel
import com.ayushsapplication.app.modules.creditcardanddebit.`data`.model.CreditcarditemsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CreditCardAndDebitVM : ViewModel(), KoinComponent {
  val creditCardAndDebitModel: MutableLiveData<CreditCardAndDebitModel> =
      MutableLiveData(CreditCardAndDebitModel())

  var navArguments: Bundle? = null

  val creditCardItemsList: MutableLiveData<MutableList<CreditcarditemsRowModel>> =
      MutableLiveData(mutableListOf())
}
