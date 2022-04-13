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

        var doctor = intent.getParcelableExtra<Doctor>("doctor")
        title = doctor?.name

//        if(doctor?.gender == Gender.male){
//            binding.imageView9.imageAlpha = R.drawable.doctormale
//        }

    }
}