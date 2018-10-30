package com.hoanglm.awavelifecycle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val locationService: LocationService = LocationService("MainActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnNavigation:Button = findViewById(R.id.btnNavigation)
        btnNavigation.setOnClickListener {
           startActivity(Intent(this,CustomActivity::class.java))
        }
        lifecycle.addObserver(locationService)
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycle.removeObserver(locationService)
    }
}
