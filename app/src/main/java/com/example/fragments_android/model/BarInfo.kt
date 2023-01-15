package com.example.fragments_android.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BarInfo(val list: ArrayList<String>) : Parcelable