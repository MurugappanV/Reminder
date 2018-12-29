package com.rethinking.silentreminder.ui.base.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.rethinking.silentreminder.R
import dagger.android.support.DaggerFragment


class BaseFragment : DaggerFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return TextView(activity).apply {
            setText(R.string.hello_blank_fragment)
        }
    }

    open protected fun startObservingLiveData() {
        //Sub class can override this method if required
    }

}
