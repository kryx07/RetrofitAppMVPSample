package com.example.sda.retrofitapp.ui.contacts

import com.example.sda.retrofitapp.network.ApiClient
import com.example.sda.retrofitapp.utlis.PrefsManager
import javax.inject.Inject

/**
 * Created by sda on 01.07.17.
 */
class ContactsPresenter() {

    @Inject lateinit var apiClient: ApiClient
    @Inject lateinit var prefsManager: PrefsManager

    var contactsMvpView: ContactsMvpView? = null



}