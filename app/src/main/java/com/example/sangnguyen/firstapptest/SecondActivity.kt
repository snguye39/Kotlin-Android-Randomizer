package com.example.sangnguyen.firstapptest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.textview_random
import kotlinx.android.synthetic.main.activity_second.textview_label
import java.util.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
    fun showRandomNumber(){
        //get count from intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        //Generate random
        val random = Random()
        var randomInt = 0

        //add one
        if(count > 0){
            randomInt = random.nextInt(count + 1)
        }
        // show random number
        textview_random.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        textview_label.text = getString(R.string.random_heading, count)

    }
}
