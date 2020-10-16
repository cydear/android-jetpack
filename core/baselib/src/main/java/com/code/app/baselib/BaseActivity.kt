package com.code.app.baselib

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * @ClassName BaseActivity
 * @Author: Lary.huang
 * @CreateDate: 2020/10/15 3:02 PM
 * @Version: 1.0
 * @Description: TODO
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView(savedInstanceState)
        setupListener()
    }

    abstract fun getLayoutId(): Int

    abstract fun initView(savedInstanceState: Bundle?)

    abstract fun setupListener()

    fun showToast(tips: String) {
        Toast.makeText(JTApp.instance, tips, Toast.LENGTH_LONG).show()
    }

    fun showToast(tipsId: Int) {
        showToast(getString(tipsId))
    }

    fun printLog(tag: String?, msg: String) {
        Log.d(tag, msg)
    }

    fun printLog(msg: String) {
        printLog(this::class.simpleName, msg)
    }
}