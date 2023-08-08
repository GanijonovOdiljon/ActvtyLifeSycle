package com.example.activitylifecycle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import androidx.annotation.ColorRes
import androidx.annotation.IdRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class Share_Pref : AppCompatActivity() {

    private lateinit var constraintLayout: ConstraintLayout
    private val Odiljon by lazy { SharePrefManeger(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_pref)
        val radioGroup:RadioGroup = findViewById(R.id.radio)
        constraintLayout  = findViewById(R.id.linear)
        changeBackColor(GetColorfun(Odiljon.getColor()))
        radioGroup.check(chakId(Odiljon.getColor()))



        radioGroup.setOnCheckedChangeListener { radioGroup, id ->
            when(id){
                R.id.red->{
                    Odiljon.caveColor(0)
                    changeBackColor(R.color.red)
                }
                R.id.gray->{
                    Odiljon.caveColor(1)
                    changeBackColor(R.color.gray)
                }
                R.id.green->{
                    Odiljon.caveColor(2)
                    changeBackColor(R.color.green)
                }
                R.id.yellow->{
                    Odiljon.caveColor(3)
                    changeBackColor(R.color.yellow)
                }
                R.id.blue->{
                    Odiljon.caveColor(4)
                    changeBackColor(R.color.blue)
                }
            }
        }
    }


    @ColorRes
    private fun GetColorfun(int: Int):Int{
        return when(int){
            0 -> R.color.red
            1 -> R.color.blue
            2 -> R.color.green
            3 -> R.color.yellow
            4 -> R.color.gray
            else -> R.color.red
        }
    }
    @IdRes
    private fun chakId(int: Int):Int{
        return when(int){
            0 -> R.color.red
            1 -> R.color.blue
            2 -> R.color.green
            3 -> R.color.yellow
            4 -> R.color.gray
            else -> R.color.red
        }
    }
    private fun changeBackColor(@ColorRes color:Int){
      constraintLayout.setBackgroundColor(ContextCompat.getColor(this,color))
    }


}
