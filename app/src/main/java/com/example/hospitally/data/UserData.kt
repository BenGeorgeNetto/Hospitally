package com.example.hospitally.data

import com.example.hospitally.data.models.User

class UserData {
    val data = User(
        "Rick Astley",
        69,
        8606140658,
        "Mar Aprem Hostel, Mar Ivanios Vidyanagar, Trivandrum"
    )

    companion object {
        fun getUserData(): User {
            return UserData().data
        }
    }
}
