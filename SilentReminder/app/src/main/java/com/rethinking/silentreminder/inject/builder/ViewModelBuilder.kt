package com.rethinking.silentreminder.inject.builder

import android.arch.lifecycle.ViewModelProvider
import com.rethinking.silentreminder.inject.ViewModelFactory
import dagger.Binds
import dagger.Module


/**
 * Created by Mahmoodha Banu J on 29/12/18.
 */
@Module
internal abstract class ViewModelBuilder {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}