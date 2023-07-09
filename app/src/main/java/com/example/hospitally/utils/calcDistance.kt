package com.example.hospitally.utils

import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt


fun calculateDistance(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double
): Double {
    val earthRadius = 6371.0 * 1000 // in meters
    val dLat = Math.toRadians(y2 - y1)
    val dLon = Math.toRadians(x2 - x1)
    val a = sin(dLat / 2) * sin(dLat / 2) + cos(Math.toRadians(y1)) * cos(
        Math.toRadians(y2)
    ) * sin(dLon / 2) * sin(dLon / 2)
    val c = 2 * atan2(sqrt(a), sqrt(1 - a))
    return earthRadius * c
}