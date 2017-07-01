package com.example.sda.retrofitapp.ui.contacts

import com.example.sda.retrofitapp.model.Client

/**
 * Created by sda on 01.07.17.
 */
interface ContactsMvpView {

    fun showProgress()

    fun hideProgress()

    fun showErrorMessage()

    fun openDetailsView(client: Client?)

    fun setCallsAdapter()

    fun setClientsAdapter()

    fun setContactsAdapter()

    fun updateRealmAdapter()
}