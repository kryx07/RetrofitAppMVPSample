package com.example.sda.retrofitapp.ui.dashboard

/**
 * Created by sda on 01.07.17.
 */
;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import com.example.sda.retrofitapp.R
import com.example.sda.retrofitapp.ui.contacts.ContactsFragment

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        ButterKnife.bind(this)

        if (savedInstanceState == null) {
            showContacts()
        }
    }

    private fun showContacts() {
        supportFragmentManager.beginTransaction()
                .add(R.layout.fragment_contacts, ContactsFragment())
                //.addToBackStack()
                .commit()
    }
}