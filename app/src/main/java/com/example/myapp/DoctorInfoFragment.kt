package com.example.myapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapp.databinding.FragmentDoctorInfoBinding


class DoctorInfoFragment : Fragment() {

    lateinit var binding: FragmentDoctorInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDoctorInfoBinding.inflate(inflater, container, false)
        val view = binding.root

        initViews()

        return view
    }


    private fun initViews() {
        var doctor = activity?.intent?.getParcelableExtra<Doctor>("doctor")
        binding.textViewName.text = doctor?.name
        binding.textViewAddress.text = doctor?.address.toString()
        binding.textViewPhoneNumber.text = doctor?.phoneNumber
    }


}