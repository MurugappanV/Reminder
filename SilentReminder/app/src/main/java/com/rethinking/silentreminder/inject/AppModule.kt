package com.rethinking.silentreminder.inject

import dagger.Module
import dagger.Provides
import io.realm.Realm
import javax.inject.Singleton


/**
 * Created by Mahmoodha Banu J on 14/12/18.
 */
@Module
class AppModule {
    @Provides
    @Singleton
    fun provideRealmInstance(): Realm {
        return Realm.getDefaultInstance()
    }

}