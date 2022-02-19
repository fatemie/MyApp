package com.example.myapp

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapp.databinding.FragmentDoctorInfoBinding


class DoctorInfoFragment : Fragment() {

    lateinit var binding: FragmentDoctorInfoBinding
    var name = "aaa"
    var city = "bbb"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDoctorInfoBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.textView5
        binding.textView6
    //    initViews()

        return view
    }


    private fun initViews() {
//       binding.textView5.text=name
//       binding.textView6.text=city
//        binding.button4.setOnClickListener{
//            Toast.makeText(activity, "clicked me", Toast.LENGTH_SHORT).show()
//        }


    }
//
//    fun setTextView(name: String, city:String){
//        this.name = name
//        this.city = city
//    }

    fun getview5(): TextView{
        return binding.textView5
    }

    fun getView6() :TextView{
        return  binding.textView6
    }

}