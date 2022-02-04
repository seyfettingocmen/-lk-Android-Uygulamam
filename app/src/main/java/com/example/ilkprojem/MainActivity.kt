package com.example.ilkprojem

import android.content.DialogInterface
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TokenWatcher
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.prefs.AbstractPreferences

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun topla (view:View){
        val sayi1 = editText.text.toString().toIntOrNull()
        val sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null){
            val uyari = AlertDialog.Builder(this@MainActivity)
            uyari.setTitle("Veri Girişi Hatası!")
            uyari.setMessage("Lütfen Geçerli Veri Giriniz!!")
            uyari.setPositiveButton("TAMAM",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Tekrar Deniyorsunuz",Toast.LENGTH_LONG).show()
            })
            uyari.show()

        }else{
            val sonuc = sayi1 + sayi2
            textView.text = "Sonuç; ${sonuc}"
        }
    }
    fun cikar (view: View){
        val sayi1 = editText.text.toString().toIntOrNull()
        val sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null ){
            val uyari = AlertDialog.Builder(this@MainActivity)
            uyari.setTitle("Veri Hatası")
            uyari.setMessage("Lütfen Geçerli Veri Giriniz!")
            uyari.setPositiveButton("TAMAM",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Tekrar Deniyorsunuz!",Toast.LENGTH_LONG).show()
            })
            uyari.show()
        }
        else{
            val sonuc = sayi1 - sayi2
            textView.text = "Sonuç; ${sonuc}"
        }
    }
    fun carp(view: View){
        val sayi1 = editText.text.toString().toIntOrNull()
        val sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null){
            val uyari = AlertDialog.Builder(this@MainActivity)
            uyari.setTitle("Veri Hatası")
            uyari.setMessage("Lütfen Geçerli Veri Giriniz!")
            uyari.setPositiveButton("TAMAM",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Tekrar Deniyorsunuz!",Toast.LENGTH_LONG).show()
            })
            uyari.show()
        }
        else {
            val sonuc = sayi1 * sayi2
            textView.text = "Sonuç; ${sonuc}"
        }
    }
    fun bol ( view: View){
        val sayi1 = editText.text.toString().toDoubleOrNull()
        val sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null){
            val uyari = AlertDialog.Builder(this@MainActivity)
            uyari.setTitle("Veri Hatası")
            uyari.setMessage("Lütfen Geçerli Veri Giriniz!")
            uyari.setPositiveButton("TAMAM",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Tekrar Deniyorsunuz!",Toast.LENGTH_LONG).show()
            })
            uyari.show()
        }
        else {
            val sonuc = sayi1 / sayi2
            textView.text = "Sonuç; ${sonuc}"
        }
    }
}