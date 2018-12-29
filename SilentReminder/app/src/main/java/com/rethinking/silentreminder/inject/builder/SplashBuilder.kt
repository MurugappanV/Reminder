package com.rethinking.silentreminder.inject.builder

import android.arch.lifecycle.ViewModel
import com.rethinking.silentreminder.inject.ViewModelKey
import com.rethinking.silentreminder.ui.base.handler.BaseHandler
import com.rethinking.silentreminder.ui.base.viewmodel.BaseViewModel
import com.rethinking.silentreminder.ui.splash.activity.SplashActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap


/**
 * Created by Mahmoodha Banu J on 29/12/18.
 */
@Module
internal abstract class SplashBuilder {

    @ContributesAndroidInjector(modules = arrayOf())
    internal abstract fun splashActivity(): SplashActivity

}