package com.example.narutodataapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Personaje(
    @StringRes val name: Int,
    @StringRes val desc: Int,
    @StringRes val desImg: Int,
    @DrawableRes val Img: Int,
    @DrawableRes val logo: Int,
)
