package com.example.baseapplication.common.extensions

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.example.baseapplication.R

fun Context.showProgressBar() {
    val dialog = Dialog(this)
    val inflate = LayoutInflater.from(this).inflate(R.layout.dialog_progress, null)
    dialog.setContentView(inflate)
    dialog.setCancelable(false)
    dialog.window!!.setBackgroundDrawable(
        ColorDrawable(Color.TRANSPARENT)
    )
    dialog.show()
}