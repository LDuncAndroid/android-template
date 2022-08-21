package com.example.app.features.start

import android.os.Bundle
import com.example.app.R
import com.example.app.base.BaseActivity
import timber.log.Timber

class MainActivity : BaseActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = viewModel()
        Timber.d("hallo log")
    }
}
