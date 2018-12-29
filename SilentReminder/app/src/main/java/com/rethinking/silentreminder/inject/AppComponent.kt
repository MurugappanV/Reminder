package com.rethinking.silentreminder.inject

import com.rethinking.silentreminder.application.SilentReminderApplication
import com.rethinking.silentreminder.inject.builder.SplashBuilder
import com.rethinking.silentreminder.inject.builder.ViewModelBuilder
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
 * Created by Mahmoodha Banu J on 14/12/18.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ViewModelBuilder::class,
        SplashBuilder::class))
interface AppComponent : AndroidInjector<SilentReminderApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SilentReminderApplication>()
}