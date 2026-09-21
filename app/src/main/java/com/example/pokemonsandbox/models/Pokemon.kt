package com.example.pokemonsandbox.models

import androidx.annotation.DrawableRes

data class Pokemon(
    val name: String,
    @DrawableRes val resourceId: Int
)