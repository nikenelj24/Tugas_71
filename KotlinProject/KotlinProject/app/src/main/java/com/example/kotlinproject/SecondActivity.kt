package com.example.kotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.*

class SecondActivity : AppCompatActivity() {
    lateinit var ket : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent();
        val nim = intent.getStringExtra("Nim")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getStringExtra("Nilai")

        if (nilai.toInt() >=90){
            ket="A"
        }else if (nilai.toInt() >=60){
            ket="B"
        }else if (nilai.toInt()>=40){
            ket="C"
        }else if (nilai.toInt()>=20){
            ket="D"
        }else if (nilai.toInt()>=0){
            ket="E"
        }


        val resultTv = findViewById<TextView>(R.id.resultTv)


        resultTv.text = "Nim        :       "+nim+"\nNama       :      "+nama+"\nNilai      :       "+nilai+"Keterangan    :     "+ket



    }
}
