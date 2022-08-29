package com.vcc.thth.helper

import android.annotation.SuppressLint
import android.content.Context
import com.vcc.thth.R
import java.text.SimpleDateFormat

@SuppressLint("SimpleDateFormat")
object TimeUtils {


    fun convertTimeToString(time: Long): String {
        val df = SimpleDateFormat("dd/MM/yyyy")
        var timeConvert = time
        if (time.toString().length < 12) timeConvert = time * 1000
        return df.format((timeConvert))

    }
}