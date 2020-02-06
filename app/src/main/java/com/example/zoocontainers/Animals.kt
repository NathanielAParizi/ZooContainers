package com.example.zoocontainers

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Animals(
    val name: String,
    val details: String
) : Parcelable