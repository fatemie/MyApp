package com.example.myapp

object Hospital {
    val drArray = arrayListOf<Doctor>()
    init
    {
        testAddDoctor()
    }



    fun testAddDoctor() {
        val doctor1 = Doctor("tabatabaei", 111, "02133333333","Tehran")
        val doctor2 = Doctor("fatemi", 222, "02133333333","Tehran")
        val doctor3 = Doctor("momeni", 333, "02133333333","Tehran")
        drArray.add(doctor1)
        drArray.add(doctor2)
        drArray.add(doctor3)
    }


}

