package com.rethinking.silentreminder.inject.builder

import com.rethinking.silentreminder.ui.ReminderTypeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Mahmoodha Banu J on 31/10/18.
 */
@Module
internal abstract class RemainderTypeFragmentBuilder {

    @ContributesAndroidInjector
    internal abstract fun reminderTypeFragment(): ReminderTypeFragment

}