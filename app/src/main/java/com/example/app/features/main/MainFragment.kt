package com.example.app.features.main

import android.os.Bundle
import android.view.View
import com.example.app.R
import com.example.app.base.BaseFragment
import com.example.app.databinding.FragmentMainBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class MainFragment : BaseFragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvMainText.text = "Hello Text with view binding"
        // Do something else
    }
}
