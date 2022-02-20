package com.example.myapp
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Doctor(var name: String, var id : Int,var phoneNumber : String, var address : String, var gender : Gender): Parcelable

enum class Gender{
    male,
    female
}