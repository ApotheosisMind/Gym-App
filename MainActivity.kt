package com.example.gym

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

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
        setContentView(R.layout.activity_main)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)



        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        val rtl = AnimationUtils.loadAnimation(this, R.anim.rtl)
        val rtl1 = AnimationUtils.loadAnimation(this, R.anim.rtl1)
        val ln  = findViewById<View>(R.id.simpleline)
        val wlc  = findViewById<TextView>(R.id.wlc)
        val gym  = findViewById<TextView>(R.id.gym)
        ln.startAnimation(ttb)
        wlc.startAnimation(rtl1)
        gym.startAnimation(rtl)

        Handler().postDelayed({
            val rtlgoback = AnimationUtils.loadAnimation(this, R.anim.rtlgoback)
            val ttbgoback = AnimationUtils.loadAnimation(this, R.anim.ttbgoback)
            val rtlgoback1 = AnimationUtils.loadAnimation(this, R.anim.rtlgobacka)

            val wlcgoback = findViewById<TextView>(R.id.wlc)
            val gymgoback  = findViewById<TextView>(R.id.gym)
            val lngoback  = findViewById<View>(R.id.simpleline)


            lngoback.startAnimation(ttbgoback)
            wlcgoback.startAnimation(rtlgoback)
            gymgoback.startAnimation(rtlgoback1)

            gymgoback.visibility = View.INVISIBLE
            wlcgoback.visibility = View.INVISIBLE
            lngoback.visibility = View.INVISIBLE


            Handler().postDelayed({
                val i = Intent(this, page2::class.java)
                startActivity(i)
                overridePendingTransition(0, 0)
            }, 1300)

            }, 2800)

    }
}
