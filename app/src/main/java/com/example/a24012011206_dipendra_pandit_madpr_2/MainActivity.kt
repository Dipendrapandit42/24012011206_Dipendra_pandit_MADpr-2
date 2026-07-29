package com.example.a24012011206_dipendra_pandit_madpr_2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(tag, "onCreate function called.")

        Toast.makeText(this, "onCreate function called.", Toast.LENGTH_SHORT).show()

        Snackbar.make(findViewById(R.id.main),
            "onCreate function called.",
            Snackbar.LENGTH_SHORT).show()
    }



    override fun onResume() {
        super.onResume()

        Log.i(tag, "onResume function called.")

        Toast.makeText(this,
            "onResume function called.",
            Toast.LENGTH_SHORT).show()

        Snackbar.make(findViewById(R.id.main),
            "onResume function called.",
            Snackbar.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()

        Log.i(tag, "onStart function called.")

        Toast.makeText(this,
            "onStart function called.",
            Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()

        Log.i(tag, "onPause function called.")
    }
    override fun onStop() {
        super.onStop()

        Log.i(tag, "onStop function called.")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(tag, "onRestart function called.")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(tag, "onDestroy function called.")
    }
}