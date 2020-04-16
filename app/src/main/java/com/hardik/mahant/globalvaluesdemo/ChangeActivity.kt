package com.hardik.mahant.globalvaluesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.hardik.mahant.globalvaluesdemo.BaseApplication.Companion.favoriteLanguage
import kotlinx.android.synthetic.main.activity_change.*

class ChangeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change)
    }

    fun onChangeBtnClicked(view: View) {
        val languageText = edtLanguage.text.toString()
        if(languageText.isEmpty()){
            Toast.makeText(this@ChangeActivity, "Seriously?", Toast.LENGTH_SHORT).show()
        }else{
            favoriteLanguage = languageText
            finish()
        }
    }
}
