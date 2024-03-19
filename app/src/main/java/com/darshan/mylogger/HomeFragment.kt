package com.darshan.mylogger

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        val fb = view.findViewById<FloatingActionButton>(R.id.add)
        fb.setOnClickListener{
            val action = DashboardFragmentDirections.actionDashboardFragmentToOverlapFragment2()
            findNavController().navigate(action)
        }
        return view
    }


}