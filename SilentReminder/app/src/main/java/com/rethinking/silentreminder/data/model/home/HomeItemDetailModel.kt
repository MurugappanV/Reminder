package com.rethinking.silentreminder.data.model.home

import io.realm.RealmObject


/**
 * Created by Mahmoodha Banu J on 29/12/18.
 */
class HomeItemDetailModel :RealmObject(){
    var type: Int? = null
    var date: String? = null
    var message: String? = null
    var phoneNumber: String? = null
    var mail: String? = null
    var website: String? = null
}