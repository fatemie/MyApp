package com.example.myapp

object Hospital {
    val drArray = arrayListOf<Doctor>()




    fun testAddDoctor() {
        val doctor1 = Doctor("Dr. tabatabaei", 111, "02133333333","Tehran, Razi Hospital", Gender.male)
        val doctor2 = Doctor("Dr. fatemi", 222, "02133333333","Tehran, Emam Khomeini Hospital", Gender.female)
        val doctor3 = Doctor("Dr. momeni", 333, "02133333333","Tehran, Milad Hospital",Gender.female)
        drArray.add(doctor1)
        drArray.add(doctor2)
        drArray.add(doctor3)
    }


}

