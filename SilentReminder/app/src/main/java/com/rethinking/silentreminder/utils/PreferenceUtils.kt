package com.rethinking.silentreminder.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import javax.inject.Inject


/**
 * Created by Mahmoodha Banu J on 30/10/18.
 */
class PreferenceUtils {

    @Inject
    lateinit var context: Context
    private var  mSharedPrefs: SharedPreferences
    private var mEditor: SharedPreferences.Editor
    constructor(context: Context){
        mSharedPrefs = PreferenceManager.getDefaultSharedPreferences(context)
        mEditor = mSharedPrefs.edit()
    }
}