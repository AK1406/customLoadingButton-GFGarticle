package com.gfg.article.customloadingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var loadingButton: LoadingButton
    private var complete = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadingButton = findViewById(R.id.custom_button)

        loadingButton.setOnClickListener {
            Toast.makeText(this,"File is downloading",Toast.LENGTH_LONG).show()
            complete = true
        }

        if(complete) {
            //call when download completed
            loadingButton.hasCompletedDownload()
        }
    }
   }