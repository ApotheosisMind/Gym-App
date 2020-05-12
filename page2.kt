package com.example.gym

import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.Image
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.coordinatorlayout.widget.CoordinatorLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page2.*


class page2 : AppCompatActivity() {

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
        setContentView(R.layout.activity_page2)
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        val vw = AnimationUtils.loadAnimation(this, R.anim.vwanim)
        val vw1 = AnimationUtils.loadAnimation(this, R.anim.vwslow)
        val vw2 = AnimationUtils.loadAnimation(this, R.anim.vwslow1)
        val vw3 = AnimationUtils.loadAnimation(this, R.anim.vwslow2)
        val vw4 = AnimationUtils.loadAnimation(this, R.anim.vwslow3)
        val vw5 = AnimationUtils.loadAnimation(this, R.anim.vwslow4)
        val vw6 = AnimationUtils.loadAnimation(this, R.anim.vwslow6)


        val bgpg1= findViewById<ImageView>(R.id.backgroundpg1)
        val heading2= findViewById<TextView>(R.id.ch)
        val heading1= findViewById<TextView>(R.id.chplan)

        val begin= findViewById<TextView>(R.id.begin)
        val inter= findViewById<TextView>(R.id.inter)
        val advance= findViewById<TextView>(R.id.advane)
        val ch1 = findViewById<TextView>(R.id.ch1)
        val ch2 = findViewById<TextView>(R.id.ch2)
        val ch3 = findViewById<TextView>(R.id.ch3)
        val r1 = findViewById<RadioButton>(R.id.beginner)
        val r2 = findViewById<RadioButton>(R.id.intermediate)
        val r3 = findViewById<RadioButton>(R.id.advance1)
        val selectplan = findViewById<Button>(R.id.selectplan)

        bgpg1.startAnimation(vw)
        heading1.startAnimation(vw1)
        heading2.startAnimation(vw2)


        begin.startAnimation(vw3)
        ch1.startAnimation(vw3)
        r1.startAnimation(vw3)

        inter.startAnimation(vw4)
        ch2.startAnimation(vw4)
        r2.startAnimation(vw4)


        advance.startAnimation(vw5)
        ch3.startAnimation(vw5)
        r3.startAnimation(vw5)

        selectplan.startAnimation(vw6)

        var planselector = findViewById<RadioGroup>(R.id.planselector)


        selectplan.setOnClickListener(){
            var selectedplan = planselector.checkedRadioButtonId
            var selectedvalue = findViewById<RadioButton>(selectedplan)
            var insert = selectedvalue.text

            if(insert.toString() == "Beginner")
            {
                val pgopen = Intent(this, beginpage::class.java)
                startActivity(pgopen)
                overridePendingTransition(0, 0)
            }
            else if(insert.toString() == "Intermediate")
            {
                val pgopen = Intent(this, intermediatepage::class.java)
                startActivity(pgopen)
                overridePendingTransition(0, 0)
            }
            else if(insert.toString() == "Advance")
            {
                val pgopen = Intent(this, advancepage::class.java)
                startActivity(pgopen)
                overridePendingTransition(0, 0)
            }


        }

    }




}
