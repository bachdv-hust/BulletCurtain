package com.bach.dv.bulletcurtain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.flexbox.FlexboxLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = FlexboxLayout(this)

    }
}