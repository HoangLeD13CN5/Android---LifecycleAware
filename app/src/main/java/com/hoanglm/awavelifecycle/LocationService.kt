package com.hoanglm.awavelifecycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class LocationService(val nameLocation:String): LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun initService(){
        Log.e("LocationService "+nameLocation+":"," OnCreateed")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startService(){
        Log.e("LocationService: "+nameLocation+":","onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopService(){
        Log.e("LocationService: "+nameLocation+":","onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun cleanUp(){
        Log.e("LocationService: "+nameLocation+":","Clean when destroy")
    }
}