package com.rethinking.silentreminder.application

import android.content.Context
import com.rethinking.silentreminder.inject.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.realm.Realm


/**
 * Created by Mahmoodha Banu J on 14/12/18.
 */
class SilentReminderApplication: DaggerApplication() {


    companion object {
        private lateinit var appContext: Context

        @JvmStatic
        fun getContext(): Context {
            return appContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        appContext = this
        setUpRealm()
    }

    private fun setUpRealm(){
        Realm.init(this)
    }


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}