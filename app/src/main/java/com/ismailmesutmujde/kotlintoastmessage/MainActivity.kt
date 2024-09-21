package com.ismailmesutmujde.kotlintoastmessage

import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlintoastmessage.databinding.ActivityMainBinding


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonNormal.setOnClickListener {
            Toast.makeText(applicationContext, "Hello", Toast.LENGTH_SHORT).show()
        }

        bindingMain.buttonPrivate.setOnClickListener {

            val design = layoutInflater.inflate(R.layout.toast_design, null)
            val textViewMessage  = design.findViewById(R.id.textViewMessage) as TextView
            textViewMessage.text = "Hello Private Message"

            val toastPrivate = Toast(applicationContext)
            toastPrivate.view = design
            toastPrivate.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL, 0,0)
            toastPrivate.duration = Toast.LENGTH_LONG
            toastPrivate.show()
        }

    }
}