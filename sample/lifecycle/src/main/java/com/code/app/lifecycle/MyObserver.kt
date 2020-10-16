package com.code.app.lifecycle

import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @ClassName MyObserver
 * @Author: Lary.huang
 * @CreateDate: 2020/10/15 3:48 PM
 * @Version: 1.0
 * @Description: TODO
 */
class MyObserver(var lifecycle: Lifecycle, var callback: CallBack) : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        dispatchCallback("onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        dispatchCallback("onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        dispatchCallback("onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        dispatchCallback("onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        dispatchCallback("onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestory() {
        dispatchCallback("onDestory")
    }

    fun dispatchCallback(methodName: String) {
        callback.update(methodName)
    }
}