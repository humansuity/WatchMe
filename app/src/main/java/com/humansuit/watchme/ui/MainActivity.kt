package com.humansuit.watchme.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.humansuit.watchme.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appToolBar = findViewById<Toolbar>(R.id.appToolBar)
        setSupportActionBar(appToolBar)

    }

}