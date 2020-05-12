package com.example.gym

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class beginpage : AppCompatActivity() {

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
    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_beginpage)

        val calendar = Calendar.getInstance()
        val day = calendar.get(Calendar.DAY_OF_WEEK)

        if(day == 2) {
            val bgmonday2 = findViewById<TextView>(R.id.bgmonday1)
            bgmonday2.setTextColor(Color.parseColor("#000000"))
            bgmonday2.textSize = 24.toFloat()
            bgmonday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen1 = Intent(this, bgmonday::class.java)
                    startActivity(pgopen1)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 3) {
            val bgtuesday2 = findViewById<TextView>(R.id.bgtuesday1)
            bgtuesday2.setTextColor(Color.parseColor("#000000"))
            bgtuesday2.textSize = 24.toFloat()
            bgtuesday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen2 = Intent(this, bgtuesday::class.java)
                    startActivity(pgopen2)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 4) {
            val bgwednesday2 = findViewById<TextView>(R.id.bgwednesday1)
            bgwednesday2.setTextColor(Color.parseColor("#000000"))
            bgwednesday2.textSize = 24.toFloat()
            bgwednesday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen3 = Intent(this, bgwednesday::class.java)
                    startActivity(pgopen3)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day === 5) {

            val bgthursday2 = findViewById<TextView>(R.id.bgthursday1)
            bgthursday2.setTextColor(Color.parseColor("#000000"))
            bgthursday2.textSize = 24.toFloat()
            bgthursday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen4 = Intent(this, bgthursday::class.java)
                    startActivity(pgopen4)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 6) {
            val bgfriday2 = findViewById<TextView>(R.id.bgfriday1)
            bgfriday2.setTextColor(Color.parseColor("#000000"))
            bgfriday2.textSize = 24.toFloat()
            bgfriday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen5 = Intent(this, bgfriday::class.java)
                    startActivity(pgopen5)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 7) {
            val bgsaturday2 = findViewById<TextView>(R.id.bgsaturday1)
            bgsaturday2.setTextColor(Color.parseColor("#000000"))
            bgsaturday2.textSize = 24.toFloat()
            bgsaturday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen6 = Intent(this, bgsaturday::class.java)
                    startActivity(pgopen6)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

        else if(day == 1) {
            val bgsunday2 = findViewById<TextView>(R.id.bgsunday1)
            bgsunday2.setTextColor(Color.parseColor("#000000"))
            bgsunday2.textSize = 24.toFloat()
            bgsunday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen7 = Intent(this, bgsunday::class.java)
                    startActivity(pgopen7)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }
    }
}
