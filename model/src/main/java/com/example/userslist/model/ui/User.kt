package com.example.userslist.model.ui

import android.os.Parcelable
import com.example.userslist.model.enum.Gender
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val id: String,
    val gender: Gender,
    val firstName: String,
    val lastName: String,
    val city: String,
    val street: String,
    val email: String,
    val age: Int,
    val phone: String,
    val cell: String,
    val avatar: String,
    val picture: String,
) : Parcelable