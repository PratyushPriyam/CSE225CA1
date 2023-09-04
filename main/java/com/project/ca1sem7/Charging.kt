package com.project.ca1sem7

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.widget.Toast

class Charging: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val status = intent?.getIntExtra(BatteryManager.EXTRA_STATUS, -1)?:-1

        val charging = status == BatteryManager.BATTERY_STATUS_CHARGING
        if(charging) {
            Toast.makeText(context, "Charging", Toast.LENGTH_SHORT).show()
        }
        if(!charging) {
            Toast.makeText(context, "Not Charging", Toast.LENGTH_SHORT).show()
        }
    }
}