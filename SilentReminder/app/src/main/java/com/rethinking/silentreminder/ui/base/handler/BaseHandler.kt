package com.rethinking.silentreminder.ui.base.handler

import android.view.View


/**
 * Created by Mahmoodha Banu J on 15/12/18.
 */
interface BaseHandler<T> {
    fun onClick(view: View, data: T?)
}