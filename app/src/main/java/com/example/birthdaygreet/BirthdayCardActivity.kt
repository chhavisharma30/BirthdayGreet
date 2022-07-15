package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_card.*

class BirthdayCardActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA= "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)

        val name = intent.getStringExtra(NAME_EXTRA)

        birthdayGreeting.text = "Happy Birthday\n$name!\n May god give you all the success and happiness!!"
    }

}