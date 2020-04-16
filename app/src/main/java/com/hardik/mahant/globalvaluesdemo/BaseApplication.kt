package com.hardik.mahant.globalvaluesdemo

import android.app.Application

class BaseApplication : Application() {

    companion object{
        var favoriteLanguage: String = "Kotlin"
    }

}