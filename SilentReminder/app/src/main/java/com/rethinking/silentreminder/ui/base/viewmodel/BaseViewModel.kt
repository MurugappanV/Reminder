package com.rethinking.silentreminder.ui.base.viewmodel

import android.arch.lifecycle.ViewModel


/**
 * Created by Mahmoodha Banu J on 15/12/18.
 */
open class BaseViewModel : ViewModel() {

    private var headerImageId = 0
    private var footerImageId = 0
    private var screenName: String? = null
    private var supportText: String? = null
    private var supportTextVisibilty = false
    private var footerImageVisibilty = false
    private var toggleImageVisibilty = false

    fun setHeaderImaggeId(headerImageId: Int) {
        this.headerImageId = headerImageId
    }

    fun setFooterImaggeId(footerImageId: Int) {
        this.footerImageId = footerImageId
    }

    fun setScreenName(screenName: String) {
        this.screenName = screenName
    }

    fun setsupportTextVisibilty(isVisible: Boolean) {
        supportTextVisibilty = isVisible
    }

    fun setsupportText(supportText: String) {
        this.supportText = supportText
    }


    fun setfooterImageVisibilty(isVisible: Boolean) {
        footerImageVisibilty = isVisible
    }

    fun settoggleImageVisibilty(isVisible: Boolean) {
        toggleImageVisibilty = isVisible
    }

}
