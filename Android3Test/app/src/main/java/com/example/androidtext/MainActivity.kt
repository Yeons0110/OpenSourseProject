/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2020039003 김성연
 * 작성일 : 2022.03.27
 *프로그램 설명 : Android Display Design
 ************************************************/

package com.example.androidtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        getSupportActionBar()?.setIcon((R.drawable.ic_launcher))

        lateinit var button1: Button
        lateinit var editTest: EditText
        lateinit var button2 : Button

        button1 = findViewById(R.id.ch_display)
        editTest = findViewById(androidx.appcompat.R.id.edit_query)
        button2 = findViewById(R.id.homepagebtn)

        button1.setOnClickListener {
            Toast.makeText(
                applicationContext, editTest.text,
                Toast.LENGTH_SHORT
            ).show()
        }
        button2.setOnClickListener{
            var mIntent = Intent(Intent.ACTION_VIEW, Uri.parse(editTest.text.toString()))
            startActivity(mIntent)
        }

        lateinit var radioButton1: RadioButton
        lateinit var radioButton2: RadioButton
        lateinit var imageView: ImageView

        radioButton1 = findViewById(R.id.radio_1)
        radioButton2 = findViewById(R.id.radio_2)
        imageView = findViewById(R.id.image_view)

        radioButton1.setOnClickListener{
            imageView.setImageResource(R.drawable.ic_launcher)
        }

        radioButton2.setOnClickListener{
            imageView.setImageResource(R.drawable.ic_launcher2)
        }
    }
}

