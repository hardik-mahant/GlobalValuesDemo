package com.hardik.mahant.globalvaluesdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hardik.mahant.globalvaluesdemo.BaseApplication.Companion.favoriteLanguage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        tvFavLanguage.text = favoriteLanguage
    }

    fun onChangeButtonClicked(view: View) {
        startActivity(Intent(this@MainActivity, ChangeActivity::class.java))
    }
}
