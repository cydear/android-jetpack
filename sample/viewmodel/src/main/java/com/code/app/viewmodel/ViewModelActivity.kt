package com.code.app.viewmodel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.code.app.baselib.BaseActivity
import com.code.app.viewmodel.viewmodel.TextViewModel

/**
 * @ClassName       ViewModelActivity
 * @Description:    描述
 * @Author:         Lary.huang
 * @CreateDate:     2020/10/16 3:51 PM
 * @Version:        1.0
 */
class ViewModelActivity : BaseActivity() {
    lateinit var tvModel: TextView
    lateinit var btnUpdate: Button

    lateinit var mode: TextViewModel

    override fun getLayoutId() = R.layout.activity_viewmodel

    override fun initView(savedInstanceState: Bundle?) {
        tvModel = findViewById(R.id.tv_model)
        btnUpdate = findViewById(R.id.btn_update)

        mode = ViewModelProviders.of(this).get(TextViewModel::class.java)

        tvModel.apply {
            text = mode?.textName
        }
    }

    override fun setupListener() {
        btnUpdate.setOnClickListener {
            mode?.textName = "Change View Model"
            tvModel.text = mode?.textName
        }
    }
}