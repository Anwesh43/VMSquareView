package com.example.linkedvmsquareview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF
import android.content.Context
import android.app.Activity

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#673AB7",
    "#00C853",
    "#304FFE",
    "#BF360C"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 5
val delay : Long = 20
val scGap : Float = 0.02f / delay
val squareFactor : Float = 14.9f
val lineFactor : Float = 4.9f
val backColor : Int = Color.parseColor("#BDBDBD")
val strokeFactor : Float = 90f