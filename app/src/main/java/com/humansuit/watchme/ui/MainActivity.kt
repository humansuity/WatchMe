package com.humansuit.watchme.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.humansuit.watchme.R
import com.humansuit.watchme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewBinding: ActivityMainBinding by viewBinding(R.id.appRootLayout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appToolBar = viewBinding.appToolBar
        setSupportActionBar(appToolBar)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment)
        val navController = (navHostFragment as NavHostFragment).navController
        viewBinding.appBottomNavView.setupWithNavController(navController)

    }

}