package com.code.app.lifecycle

import android.os.Bundle
import android.widget.Toast
import com.code.app.baselib.BaseActivity
import com.code.app.baselib.JTApp

/**
 * @ClassName LifeCycleActivity
 * @Author: Lary.huang
 * @CreateDate: 2020/10/15 3:26 PM
 * @Version: 1.0
 * @Description: TODO
 */
class LifeCycleActivity : BaseActivity() {

    override fun getLayoutId() = R.layout.activity_lifecycle_layout

    override fun initView(savedInstanceState: Bundle?) {
        var myObserver = MyObserver(lifecycle, object : CallBack {
            override fun update(tips: String) {
                Toast.makeText(JTApp.instance, "LifeCycleActivity ========> call method =>" + tips, Toast.LENGTH_SHORT).show()
            }
        })
        lifecycle.addObserver(myObserver)
    }

    override fun setupListener() {

    }

}