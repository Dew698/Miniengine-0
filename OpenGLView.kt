package com.engine

import android.content.Context
import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class OpenGLView(context: Context) : GLSurfaceView(context), GLSurfaceView.Renderer {

    init {
        setEGLContextClientVersion(3)
        setRenderer(this)
    }

    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
        nativeInit()
    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
        nativeResize(width, height)
    }

    override fun onDrawFrame(gl: GL10?) {
        nativeRender()
    }

    private external fun nativeInit()
    private external fun nativeResize(width: Int, height: Int)
    private external fun nativeRender()

    companion object {
        init {
            System.loadLibrary("minigame")
        }
    }
}