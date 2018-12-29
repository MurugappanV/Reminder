package com.rethinking.silentreminder.ui.base.activity

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.view.View
import com.rethinking.silentreminder.R
import com.rethinking.silentreminder.data.model.base.BaseModel
import com.rethinking.silentreminder.databinding.ActivityBaseBinding
import com.rethinking.silentreminder.ui.base.handler.BaseHandler
import com.rethinking.silentreminder.ui.base.viewmodel.BaseViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity(),BaseHandler<BaseModel> {


    var binding: ActivityBaseBinding? = null
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_base)
        //binding?.baseModel = ViewModelProviders.of(this, viewModelFactory).get(BaseViewModel::class.java)
        binding?.handlers = this
    }

    override fun onClick(view: View, data: BaseModel?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    open protected fun startObservingLiveData() {
        //Sub class can override this method if required
    }

    open protected fun getViewModel(): BaseViewModel? {
        //Sub class can override this method if required
        return null
    }

    protected fun addFragment(@IdRes containerId: Int, fragment: Fragment, args: Bundle? = null, addToBackStack: Boolean = false, fragmentTag: String? = null) {
        if (isFinishing) return

        args?.run {
            fragment.arguments = args
        }


        val ft = supportFragmentManager.beginTransaction().add(containerId, fragment, fragmentTag)
        if (addToBackStack) {
            ft.addToBackStack(null).commit()
        } else {
            ft.commit()
        }
    }

    protected fun replaceFragment(@IdRes containerId: Int, fragment: Fragment, args: Bundle? = null, addToBackStack: Boolean = false, fragmentTag: String? = null) {
        if (isFinishing) return

        args?.run {
            fragment.arguments = args
        }

        val ft = supportFragmentManager.beginTransaction().replace(containerId, fragment, fragmentTag)
        if (addToBackStack) {
            ft.addToBackStack(null).commit()
        } else {
            ft.commit()
        }
    }

}
