package com.rethinking.silentreminder.inject

import com.rethinking.silentreminder.application.SilentReminderApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
 * Created by Mahmoodha Banu J on 30/10/18.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class))
interface AppComponent : AndroidInjector<SilentReminderApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SilentReminderApplication>()
}