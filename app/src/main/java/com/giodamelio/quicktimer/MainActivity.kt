package com.giodamelio.quicktimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setTimer(view: View) {
        val seconds = view.tag.toString().toInt()
        Log.d("MainActivity", "Setting Timer for $seconds seconds")

        val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "QuickTimer")
            putExtra(AlarmClock.EXTRA_LENGTH, seconds)
            //putExtra(AlarmClock.EXTRA_SKIP_UI, true)
        }
        startActivity(intent)
    }
}