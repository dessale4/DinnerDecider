package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    var array:ArrayList<String> = ArrayList<String>(arrayListOf("Humberger", "Pizza", "Mexican", "American", "Chinese"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dinner.text = array[0]
    }
    fun newChoice(view: View){
        if(newDinner.text.isNotEmpty()){
            dinner.text = newDinner.text.toString()
            array.add(newDinner.text.toString())
            newDinner.text = null
        }

    }
    fun choosen(view: View){
        var index: Double = (Math.random() * (((array.size -1) - 0) + 1)) + 0
        var value: Int = index.toInt();

        dinner.text = array[value]
    }
    
}
