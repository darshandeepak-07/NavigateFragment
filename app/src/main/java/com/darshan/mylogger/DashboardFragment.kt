package com.darshan.mylogger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView


class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val homeFragment = HomeFragment()
        childFragmentManager.beginTransaction().replace(R.id.container, homeFragment).commit()

        val nav = view.findViewById<BottomNavigationView>(R.id.bottomNav)
        nav.setOnItemSelectedListener { view ->
            when (view.itemId) {
                R.id.homem -> {
                    childFragmentManager.beginTransaction().replace(R.id.container, HomeFragment())
                        .commit()
                    true
                }
                R.id.settingsm -> {
                    childFragmentManager.beginTransaction()
                        .replace(R.id.container, SettingsFragment()).commit()
                    true
                }
                else -> {
                    false
                }
            }

        }
        return view
    }


}