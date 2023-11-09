package com.example.sightseekerdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform