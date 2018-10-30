package com.rethinking.silentreminder.inject

import com.rethinking.silentreminder.application.AppNavigator
import com.rethinking.silentreminder.application.SilentReminderApplication
import com.rethinking.silentreminder.utils.PreferenceUtils
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by Mahmoodha Banu J on 30/10/18.
 */
@Module
class AppModule {


    @Provides
    @Singleton
    fun provideAppNavigator(): AppNavigator {
        return AppNavigator()
    }



    @Provides
    @Singleton
    fun providePreferenceutils(): PreferenceUtils {
        return PreferenceUtils(SilentReminderApplication.getContext())
    }

}