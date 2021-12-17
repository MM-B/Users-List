package com.example.userslist.model.mapper

import com.example.userslist.model.enum.Gender
import com.example.userslist.model.network.UserNetwork
import com.example.userslist.model.ui.User

fun UserNetwork.toUser() = User(
    id = id.value,
    gender = if (gender == "female") Gender.Female else Gender.Male,
    firstName = name.first,
    lastName = name.last,
    city = location.city,
    street = location.street.name,
    email = email,
    age = dob.age,
    phone = phone,
    cell = cell,
    avatar = picture.medium,
    picture = picture.large,
)

fun List<UserNetwork>.toUsers() = map { it.toUser() }