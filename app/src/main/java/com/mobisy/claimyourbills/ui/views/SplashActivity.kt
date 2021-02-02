package com.mobisy.claimyourbills.ui.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.mobisy.claimyourbills.MainActivity
import com.mobisy.claimyourbills.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var handler = Handler()
        handler.postDelayed(Runnable {
            var intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}