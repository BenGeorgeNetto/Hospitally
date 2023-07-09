package com.example.hospitally.data.models

data class Hospital(
    val address: String,
    val contact: String,
    val hospitalName: String,
    val specializations: String,
    val lat: Double,
    val long: Double
)