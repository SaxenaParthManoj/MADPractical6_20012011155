package com.example.madpractical6_20012011155

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myVideoView=findViewById<VideoView>(R.id.AEZAKMI)
        val myFloatingActionButton=findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val mediaController=MediaController(this)
        val uri:Uri= Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI()
        myVideoView.requestFocus()
        myVideoView.start()
    }
}