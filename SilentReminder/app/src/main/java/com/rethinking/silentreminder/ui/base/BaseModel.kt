package com.rethinking.silentreminder.ui.base

import android.databinding.BaseObservable
import android.os.Parcelable
import android.support.v4.app.Fragment


/**
 * Created by Mahmoodha Banu J on 31/10/18.
 */
abstract class BaseModel(@Transient open var layoutResId: Int? = null,
                         @Transient open var title: String? = null,
                         @Transient var fragment: Fragment? = null) : BaseObservable(), Parcelable {
}