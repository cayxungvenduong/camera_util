package com.example.my_camera

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.my_camera.utils.Camera2BasicFragment

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        if (savedInstanceState != null) savedInstanceState else supportFragmentManager.beginTransaction()
            .replace(R.id.container, Camera2BasicFragment.newInstance())
            .commit()
    }

}
