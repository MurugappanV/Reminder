package com.rethinking.silentreminder.ui.base



import android.content.pm.PackageManager
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.view.View
import android.view.ViewGroup
import com.rethinking.silentreminder.application.SilentReminderApplication
import dagger.android.support.DaggerAppCompatActivity


abstract class BaseActivity : DaggerAppCompatActivity() {

    protected val TAG = BaseActivity::class.java.simpleName


    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        initSetup()
    }

    override fun setContentView(view: View?) {
        super.setContentView(view)
        initSetup()
    }

    override fun setContentView(view: View?, params: ViewGroup.LayoutParams?) {
        super.setContentView(view, params)
        initSetup()
    }

    private fun initSetup() {
    }


    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
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


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        onPermissionResult(requestCode,
                grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED);
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        //3 min logout implementation
        //(SilentReminderApplication.getContext() as SilentReminderApplication).touch()
    }

    open protected fun onPermissionResult(requestCode: Int, granted: Boolean) {
        //Sub class can override this method if required
    }

}