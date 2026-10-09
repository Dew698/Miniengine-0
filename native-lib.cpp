#include <jni.h>
#include "renderer.h"

static Renderer* g_renderer = nullptr;

extern "C" {

JNIEXPORT void JNICALL
Java_com_engine_OpenGLView_nativeInit(JNIEnv *env, jobject thiz) {
    if (!g_renderer) {
        g_renderer = new Renderer();
    }
    g_renderer->init();
}

JNIEXPORT void JNICALL
Java_com_engine_OpenGLView_nativeResize(JNIEnv *env, jobject thiz, jint width, jint height) {
    if (g_renderer) {
        g_renderer->resize(width, height);
    }
}

JNIEXPORT void JNICALL
Java_com_engine_OpenGLView_nativeRender(JNIEnv *env, jobject thiz) {
    if (g_renderer) {
        g_renderer->render();
    }
}

}