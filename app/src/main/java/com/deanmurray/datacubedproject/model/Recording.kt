package com.deanmurray.datacubedproject.model

import java.util.*

data class Recording(
    val recording_name: String,
    val recording_duration: Int,
    val recording_time: Date
)