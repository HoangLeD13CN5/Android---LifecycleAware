package com.hoanglm.awavelifecycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CustomActivity : AppCompatActivity(), LifecycleOwner{

    lateinit var registry: LifecycleRegistry
    val locationService: LocationService = LocationService("CustomActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)
        registry = LifecycleRegistry(this)
        registry.markState(Lifecycle.State.CREATED)
        lifecycle.addObserver(locationService)
    }

    override fun onStart() {
        super.onStart()
        registry.markState(Lifecycle.State.STARTED)
    }

    override fun onDestroy() {
        super.onDestroy()
        registry.markState(Lifecycle.State.DESTROYED)
    }

    override fun getLifecycle(): Lifecycle {
        return registry
    }
}
