package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(

    @StringRes val name: Int,
    val courseCount: Int,
    @DrawableRes val imageResourceId: Int
)
