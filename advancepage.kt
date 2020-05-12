package com.example.gym

import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import java.util.*

class advancepage : AppCompatActivity() {

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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_advancepage)


        val calendar = Calendar.getInstance()
        val day = calendar.get(Calendar.DAY_OF_WEEK)

        if (day == 2) {
            val admonday2 = findViewById<TextView>(R.id.admonday1)
            admonday2.setTextColor(Color.parseColor("#000000"))
            admonday2.textSize = 24.toFloat()
            admonday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen1 = Intent(this, admonday::class.java)
                    startActivity(pgopen1)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        } else if (day == 3) {
            val adtuesday2 = findViewById<TextView>(R.id.adtuesday1)
            adtuesday2.setTextColor(Color.parseColor("#000000"))
            adtuesday2.textSize = 24.toFloat()
            adtuesday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen2 = Intent(this, adtuesday::class.java)
                    startActivity(pgopen2)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        } else if (day == 4) {
            val adwednesday2 = findViewById<TextView>(R.id.adwednesday1)
            adwednesday2.setTextColor(Color.parseColor("#000000"))
            adwednesday2.textSize = 24.toFloat()
            adwednesday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen3 = Intent(this, adwednesday::class.java)
                    startActivity(pgopen3)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        } else if (day === 5) {
            val adthursday2 = findViewById<TextView>(R.id.adthursday1)
            adthursday2.setTextColor(Color.parseColor("#000000"))
            adthursday2.textSize = 24.toFloat()
            adthursday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen4 = Intent(this, adthursday::class.java)
                    startActivity(pgopen4)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        } else if (day == 6) {
            val adfriday2 = findViewById<TextView>(R.id.adfriday1)
            adfriday2.setTextColor(Color.parseColor("#000000"))
            adfriday2.textSize = 24.toFloat()
            adfriday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen5 = Intent(this, adfriday::class.java)
                    startActivity(pgopen5)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        } else if (day == 7) {
            val adsaturday2 = findViewById<TextView>(R.id.adsaturday1)
            adsaturday2.setTextColor(Color.parseColor("#000000"))
            adsaturday2.textSize = 24.toFloat()

            adsaturday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen6 = Intent(this, adsaturday::class.java)
                    startActivity(pgopen6)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        } else if (day == 1) {
            val adsunday2 = findViewById<TextView>(R.id.adsunday1)
            adsunday2.setTextColor(Color.parseColor("#000000"))
            adsunday2.textSize = 24.toFloat()

            adsunday2.setOnClickListener() {
                Handler().postDelayed({
                    val pgopen7 = Intent(this, adsunday::class.java)
                    startActivity(pgopen7)
                    overridePendingTransition(0, 0)
                }, 350)
            }
        }

    }
}
