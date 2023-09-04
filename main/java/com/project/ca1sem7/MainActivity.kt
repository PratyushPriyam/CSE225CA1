package com.project.ca1sem7

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var airplaneReceiver: AirplaneMode
    lateinit var charging: Charging
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        airplaneReceiver = AirplaneMode()
        charging = Charging()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(airplaneReceiver, it)
        }
        IntentFilter(Intent.ACTION_BATTERY_CHANGED).also {
            registerReceiver(charging, it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(airplaneReceiver)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(charging)
    }
}