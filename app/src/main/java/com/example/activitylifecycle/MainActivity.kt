package com.example.activitylifecycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var btn:MaterialButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast( "onCreate ishga tushdi")
        log("OnCreate ishga tushdi")
        btn = findViewById(R.id.btn)
        btn.setOnClickListener{
            startActivity(Intent(this,second::class.java))
        }
    }
    override fun onStart(){
        super.onStart()
        toast("OnStart ishga tushdi")
        log("onStart ishga tushdi")
    }
    override fun onResume(){
        super.onResume()
        toast("OnResume ishga tushdi")
        log("onResume ishga tushdi")
    }
    override fun onPause(){
        super.onPause()
        toast("OnPause ishga tushdi")
        log("onPause ishga tushdi")
    }
    override fun onStop(){
        super.onStop()
        
        toast("OnStop ishga tushdi")
        log("onStop ishga tushdi")
    }
    override fun onDestroy(){
        super.onDestroy()
        toast("OnDestroy ishga tushdi")
        log("onDestroy ishga tushdi")
    }
    override fun onRestart(){
        super.onRestart()
        toast("OnRestart ishga tushdi")
        log("onRestart ishga tushdi")
    }
    private fun toast(text: String){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
    private fun log(msg:String){
        Log.d("MainActivity@@",msg)
    }
}