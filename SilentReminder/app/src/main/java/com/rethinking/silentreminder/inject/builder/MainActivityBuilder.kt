package com.rethinking.silentreminder.inject.builder

import com.rethinking.silentreminder.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Mahmoodha Banu J on 31/10/18.
 */
@Module
internal abstract class MainActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(RemainderTypeFragmentBuilder::class))
    internal abstract fun mainActivity(): MainActivity

}