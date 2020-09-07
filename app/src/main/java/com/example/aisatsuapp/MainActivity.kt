package com.example.aisatsuapp

import android.app.TimePickerDialog
import android.net.sip.SipAudioCall
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val hour = this
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
            },
            13, 0, true
        )

        if (2 <= hour && hour <= 9 ) {
            textView.text = "おはよう"
        } else if (10 <= hour && hour <= 18 ) {
            textView.text = "こんにちは"
        } else {
            textView.text = "こんばんは"
        }
        timePickerDialog.show()
    }

}
