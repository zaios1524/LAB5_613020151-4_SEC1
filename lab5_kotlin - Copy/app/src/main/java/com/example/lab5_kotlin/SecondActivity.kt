package com.example.lab5_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data :Bundle? = intent.extras
        var newStudent : Student? = data?.getParcelable<Student>( "stdData")
        idText.text = "student ID: ${newStudent?.id}"
        nameText.text = "student name : ${newStudent?.name}"
        ageText.text = "student age : ${newStudent?.age}"
    }

    fun onClickClose(view : View) {
        finish()
    }
}