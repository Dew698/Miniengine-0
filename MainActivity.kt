package com.engine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var glView: OpenGLView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        glView = OpenGLView(this)
        setContentView(glView)
    }

    override fun onResume() {
        super.onResume()
        glView.onResume()
    }

    override fun onPause() {
        super.onPause()
        glView.onPause()
    }
}