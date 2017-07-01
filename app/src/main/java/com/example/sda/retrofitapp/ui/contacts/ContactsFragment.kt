package com.example.sda.retrofitapp.ui.contacts

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import com.example.sda.retrofitapp.R
import com.example.sda.retrofitapp.model.Client
import javax.inject.Inject

/**
 * Created by sda on 01.07.17.
 */
class ContactsFragment : Fragment(), ContactsMvpView {

    @Inject lateinit var contactsPresenter: ContactsFragment

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_contacts, container, false) as View
        ButterKnife.bind(this, view)
        return view
    }

    override fun onStart() {
        super.onStart()

    }

    /*private fun init() {
        contactsPresenter.attachView(this)
        realm = Realm.getDefaultInstance()

        contactRealmResults = realm.where(Contact::class.java)
                .equalTo("name", "Jan")
                .or()
                .endsWith("name", "zl")
                .findAll()
        contactAdapter = RealmContactAdapter(contactRealmResults, true)

        recycler.setLayoutManager(LinearLayoutManager(this))
        recycler.setAdapter(contactAdapter)

        mainPresenter.setCallsAdapter(callsAdapter)
        mainPresenter.setClientsAdapter(clientsAdapter)
        mainPresenter.setContactAdapter(contactAdapter)
        mainPresenter.setRealm(realm)
    }*/

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showErrorMessage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openDetailsView(client: Client?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCallsAdapter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setClientsAdapter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setContactsAdapter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateRealmAdapter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}