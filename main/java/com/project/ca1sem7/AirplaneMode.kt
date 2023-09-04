package com.project.ca1sem7

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneMode: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isActive = intent?.getBooleanExtra("state", false)?:return
        if(isActive) {
            Toast.makeText(context, "Airplane Mode ON", Toast.LENGTH_SHORT).show()
        }
        if(!isActive) {
            Toast.makeText(context, "Airplane Mode OFF", Toast.LENGTH_SHORT).show()
        }
    }
}