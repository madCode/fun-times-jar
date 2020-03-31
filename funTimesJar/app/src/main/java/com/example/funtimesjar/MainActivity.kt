package com.example.funtimesjar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // make the "piece of paper" a random pastel color with a random slightly darker edge
        // if they click on the jar, pull a random scroll out and show it in the right color
        // if they click send, swipe the piece of paper away and slip it into the jar in the right color
            // maybe as a paper airplane?
            // maybe the jar is a box that's empty? That might be easier to swipe the paper airplane into?
        // swipe in a new "piece of paper"
    }
}
