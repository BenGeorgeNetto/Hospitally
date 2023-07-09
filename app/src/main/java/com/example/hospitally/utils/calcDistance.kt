package com.example.hospitally.utils

import com.google.common.primitives.UnsignedBytes.toInt
import kotlin.math.*



fun calculateDistance(lat2: Double, lon2: Double): Int {
    val earthRadius = 6371 // Radius of the Earth in kilometers

//    val lat2: Double? = lat2.toDouble()
//    val lon2: Double? = lon2.toDouble()
    val lat1 = 9.0
    val lon1 = 77.0

    val dLat = Math.toRadians(lat2 - lat1)
    val dLon = Math.toRadians(lon2 - lon1)

    val a = sin(dLat / 2) * sin(dLat / 2) +
            cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2)) *
            sin(dLon / 2) * sin(dLon / 2)

    val c = 2 * atan2(sqrt(a), sqrt(1 - a))

    return (earthRadius * c).toInt()
}