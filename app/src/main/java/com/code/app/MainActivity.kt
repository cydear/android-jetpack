package com.code.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.code.app.baselib.BaseActivity
import com.code.app.lifecycle.LifeCycleActivity

class MainActivity : BaseActivity() {
    lateinit var btnLifeCycle: Button

    override fun getLayoutId() = R.layout.activity_main

    override fun initView(savedInstanceState: Bundle?) {
        btnLifeCycle = findViewById(R.id.btn_lifecycle)
    }

    override fun setupListener() {
        btnLifeCycle.setOnClickListener {
            startActivity(Intent(this, LifeCycleActivity::class.java))
        }
    }
}