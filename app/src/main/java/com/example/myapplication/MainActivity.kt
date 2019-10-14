package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

//MainActivity is an instance of AppCompactActivity
class MainActivity : AppCompatActivity() {

    //onCreate = main(0 function
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //Display UI. R=Resources
        setContentView(R.layout.activity_main)
        //TODO : Continue your code here
        //val = value, var = variable
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        val nameReset: Button = findViewById(R.id.nameReset)
        buttonShowName.setOnClickListener{showName()}
        nameReset.setOnClickListener{Reset()}
    }

    private fun Reset() {
        textViewName.setText("Hello World")
    }

    private fun showName() {

        textViewName.setText("Hello biqsbiqs")
    }
}
