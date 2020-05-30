package com.dpashko.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.dpashko.insets.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MainFragment : DaggerFragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    private lateinit var viewModel: MainFragmentViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, factory).get(MainFragmentViewModel::class.java)
    }
}
