package com.example.mad_practical_6_21012011109

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Play:FloatingActionButton=findViewById(R.id.play_btn)

        Play.setOnClickListener {
            PlayPause()
        }
        val Pause : FloatingActionButton=findViewById(R.id.stop_btn)

        Pause.setOnClickListener {
            Stop()
        }
    }

    fun PlayPause(){
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply {
            startService(this)
        }

    }

    fun Stop(){
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply {
            stopService(this)
        }

    }
}