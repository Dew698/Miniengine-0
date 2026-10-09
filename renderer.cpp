#include "renderer.h"
#include <GLES3/gl3.h>

void Renderer::init() {
    glClearColor(0.15f, 0.15f, 0.25f, 1.0f);
}

void Renderer::resize(int width, int height) {
    glViewport(0, 0, width, height);
}

void Renderer::render() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
}