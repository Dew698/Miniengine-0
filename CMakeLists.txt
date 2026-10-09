cmake_minimum_required(VERSION 3.22.1)
project("minigame")

add_library(
        minigame
        SHARED
        native-lib.cpp
        renderer.cpp
)

find_library(
        log-lib
        log
)

find_library(
        gles-lib
        GLESv3
)

target_link_libraries(
        minigame
        ${log-lib}
        ${gles-lib}
)