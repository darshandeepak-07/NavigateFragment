package com.darshan.mylogger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.darshan.mylogger.databinding.ActivityMainBinding
import com.darshan.mylogger.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_login, container, false)
       binding = FragmentLoginBinding.inflate(inflater,container,false)

        binding.register.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            findNavController().navigate(action)
        }
        binding.login.setOnClickListener{
            if(binding.username.text.toString().equals("admin") && binding.password.text.toString().equals("2003")){
                val action = LoginFragmentDirections.actionLoginFragmentToDashboardFragment2()
                findNavController().navigate(action)
                Toast.makeText(context,"Login Successful",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context,"Login Failed",Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }


}