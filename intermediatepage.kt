package com.example.gym

import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.*

class intermediatepage : AppCompatActivity() {

    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finishAffinity()
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)

    }


    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }

    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE)
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_intermediatepage)


        val calendar = Calendar.getInstance()
        val day = calendar.get(Calendar.DAY_OF_WEEK)

        if(day == 2) {
            val inmonday2 = findViewById<TextView>(R.id.inmonday1)
            inmonday2.textSize = 24.toFloat()
            inmonday2.setTextColor(Color.parseColor("#000000"))
            inmonday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen1 = Intent(this, inmonday::class.java)
                    startActivity(pgopen1)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 3) {
            val intuesday2 = findViewById<TextView>(R.id.intuesday1)
            intuesday2.textSize = 24.toFloat()
            intuesday2.setTextColor(Color.parseColor("#000000"))
            intuesday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen2 = Intent(this, intuesday::class.java)
                    startActivity(pgopen2)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 4) {
            val inwednesday2 = findViewById<TextView>(R.id.inwednesday1)
            inwednesday2.textSize = 24.toFloat()
            inwednesday2.setTextColor(Color.parseColor("#000000"))
            inwednesday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen3 = Intent(this, inwednesday::class.java)
                    startActivity(pgopen3)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day === 5) {
            val inthursday2 = findViewById<TextView>(R.id.inthursday1)
            inthursday2.textSize = 24.toFloat()
            inthursday2.setTextColor(Color.parseColor("#000000"))
            inthursday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen4 = Intent(this, inthursday::class.java)
                    startActivity(pgopen4)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 6) {
            val infriday2 = findViewById<TextView>(R.id.infriday1)
            infriday2.textSize = 24.toFloat()
            infriday2.setTextColor(Color.parseColor("#000000"))
            infriday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen5 = Intent(this, infriday::class.java)
                    startActivity(pgopen5)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 7) {
            val insaturday2 = findViewById<TextView>(R.id.insaturday1)
            insaturday2.textSize = 24.toFloat()
            insaturday2.setTextColor(Color.parseColor("#000000"))
            insaturday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen6 = Intent(this, insaturday::class.java)
                    startActivity(pgopen6)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 1) {
            val insunday2 = findViewById<TextView>(R.id.insunday1)
            insunday2.setTextColor(Color.parseColor("#000000"))
            insunday2.textSize = 24.toFloat()
            insunday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen7 = Intent(this, insunday::class.java)
                    startActivity(pgopen7)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }
    }
}
