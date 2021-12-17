package com.example.userslist.model.ui

import android.os.Parcelable
import com.example.userslist.model.enum.Gender
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val id: String = "1",
    val gender: Gender = Gender.Male,
    val firstName: String = "Ali",
    val lastName: String = "Alizadeh",
    val city: String = "Tehran",
    val street: String = "Saadat Abbad",
    val email: String = "alialix@gmail.com",
    val age: Int = 45,
    val phone: String = "091012312312",
    val cell: String = "02123454553",
    val avatar: String = "https://randomuser.me/api/portraits/men/75.jpg",
    val picture: String = "https://randomuser.me/api/portraits/med/men/75.jpg",
) : Parcelable