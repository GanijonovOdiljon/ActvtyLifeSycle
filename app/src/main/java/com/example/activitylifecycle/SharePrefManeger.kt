package com.example.activitylifecycle

import android.content.Context
import android.content.SharedPreferences

class SharePrefManeger(context: Context) {
    private val sharePreferences: SharedPreferences =
        context.getSharedPreferences("MyPref2",Context.MODE_PRIVATE)

    fun caveColor(int: Int){
        val etitor = sharePreferences.edit()
        etitor.putInt("color",int)
        etitor.apply()
    }

    fun getColor():Int{
        return sharePreferences.getInt("color",-1)
    }

    fun counter(int: Int){
        val edit = sharePreferences.edit()
        edit.putInt("count",int)
        edit.apply()
    }
    fun getCount():Int{
        return sharePreferences.getInt("count",0)
    }

    fun clear(){
        sharePreferences.edit().clear().apply()
    }



}