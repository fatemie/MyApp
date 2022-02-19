package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var infoFragment = DoctorInfoFragment()


        var doctor = intent.getParcelableExtra<Doctor>("doctor")
     //   binding.textView5.text = doctor?.name
     //   binding.textView6.text = doctor?.id.toString()



        // infoFragment.setTextView(doctor?.name.toString(),doctor?.id.toString())
        infoFragment.getview5().text = doctor?.name.toString()
        infoFragment.getView6().text =doctor?.id.toString()


    }
}