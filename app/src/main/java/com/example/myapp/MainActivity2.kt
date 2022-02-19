package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.text= Hospital.drArray[0].name
        binding.button2.text= Hospital.drArray[1].name
        binding.button3.text= Hospital.drArray[2].name

        binding.button.setOnClickListener{
            goToActivity(Hospital.drArray[0])
        }

        binding.button2.setOnClickListener{
            goToActivity(Hospital.drArray[1])
        }

        binding.button3.setOnClickListener{
            goToActivity(Hospital.drArray[2])
        }
    }

    private fun goToActivity(doctor : Doctor) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("doctor",doctor )
        startActivity(intent)
    }
}