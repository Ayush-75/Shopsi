package com.ayushsapplication.app.modules.addaddress.`data`.model

import com.ayushsapplication.app.R
import com.ayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddAddressModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryOrRegion: String? =
      MyApp.getInstance().resources.getString(R.string.msg_country_or_region)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstName: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_street_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetAddressTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_street_address_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStateProvinceRegion: String? =
      MyApp.getInstance().resources.getString(R.string.msg_state_province_region)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_zip_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCountryEditTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFirstNameEditTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLastNameEditTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStreetAddressEditTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStreetAddressTwoEditTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCityEditTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldPasswordEditTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etZipCodeEditTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPhoneNumberEditTextValue: String? = null
)
