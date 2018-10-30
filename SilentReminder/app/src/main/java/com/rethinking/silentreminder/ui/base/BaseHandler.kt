package com.emory.mcubbed.ui.base

import android.view.View

/**
 * Created by Ranjith Yadav on 07-02-2018.
 */
interface BaseHandler<T> {
    fun onClick(view: View, data: T?)
}
