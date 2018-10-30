package com.hoanglm.awavelifecycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log
/*
* Class lister change of state lifecycle of LifecycleOwner
* implements: LifecycleObserver
* Then you use LifecycleOwner invoke addObserver() and passing an instance of this observer, it will lister change of state lifecycle.
* When you dont lister, you user LifecycleOwner invoke removeObserver() and passing an instance of this observer
* */
class LocationService(val nameLocation:String): LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun initService(){
        Log.e("LocationService " + nameLocation + ":"," OnCreateed")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startService(){
        Log.e("LocationService: " + nameLocation + ":","onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopService(){
        Log.e("LocationService: " + nameLocation + ":","onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun cleanUp(){
        Log.e("LocationService: " + nameLocation + ":","onDestroy")
    }
}