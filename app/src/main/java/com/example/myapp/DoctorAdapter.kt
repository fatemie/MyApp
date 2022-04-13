package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.databinding.ActivityMain2Binding.bind

typealias DoctorClickHandler = (Doctor) -> Unit

class DoctorAdapter(var onDoctorClicked : DoctorClickHandler) :
    ListAdapter<Doctor, DoctorAdapter.ViewHolder>(DoctorDiffCallback) {


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var btnDoctorName = view.findViewById<Button>(R.id.btnDoctorName)

        fun bind(doctor : Doctor, onDoctorClicked: DoctorClickHandler){
            btnDoctorName.text = doctor.name.toString()
            btnDoctorName.setOnClickListener {
                onDoctorClicked(doctor)
            }
        }
    }



    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): DoctorAdapter.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.doctor_row_item, viewGroup , false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoctorAdapter.ViewHolder, position: Int) {
        val doctor = getItem(position)
        holder.bind(doctor, onDoctorClicked)
    }

}

object DoctorDiffCallback : DiffUtil.ItemCallback<Doctor>() {
    override fun areItemsTheSame(oldItem: Doctor, newItem: Doctor): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Doctor, newItem: Doctor): Boolean {
        return oldItem.id == newItem.id
    }
}