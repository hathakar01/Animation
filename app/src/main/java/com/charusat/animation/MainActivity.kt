package com.charusat.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var img1:ImageView = findViewById(R.id.imageView)
        var btn1:Button = findViewById(R.id.btnFadeIn)
        var btn2:Button = findViewById(R.id.btnFadeOut)
        var btn3:Button = findViewById(R.id.btnRotate)
        var btn4:Button = findViewById(R.id.btnZoomIn)
        var btn5:Button = findViewById(R.id.btnZoomOut)
        var btn6:Button = findViewById(R.id.btnSlideUp)
        var btn7:Button = findViewById(R.id.btnSlideDown)

        btn1.setOnClickListener {
                var FadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in)
                img1.startAnimation(FadeIn)
        }
        btn2.setOnClickListener {
            var FadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out)
            img1.startAnimation(FadeOut)
        }
        btn3.setOnClickListener {
            var Rotate = AnimationUtils.loadAnimation(this,R.anim.rotate)
            img1.startAnimation(Rotate)
        }
        btn4.setOnClickListener {
            var ZoomIn = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            img1.startAnimation(ZoomIn)
        }
        btn5.setOnClickListener {
            var ZoomOut = AnimationUtils.loadAnimation(this,R.anim.zoom_out)
            img1.startAnimation(ZoomOut)
        }
        btn6.setOnClickListener {
            var SlideUp = AnimationUtils.loadAnimation(this,R.anim.slide_up)
            img1.startAnimation(SlideUp)
        }
        btn7.setOnClickListener {
            var SlideDown = AnimationUtils.loadAnimation(this,R.anim.slide_down)
            img1.startAnimation(SlideDown)
        }
    }
}