package com.code.app.baselib

import android.app.Application
import android.content.Context

/**
 * @ClassName JTApp
 * @Author: Lary.huang
 * @CreateDate: 2020/10/15 3:06 PM
 * @Version: 1.0
 * @Description: TODO
 */
class JTApp : Application() {
    companion object {
        var instance: JTApp? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}