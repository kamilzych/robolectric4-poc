package com.kz.robolectric4

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (intent.hasExtra(STRING_KEY)) {
            val stringExtra = intent.getStringExtra(STRING_KEY)
            println("$STRING_KEY found with value : $stringExtra")
        } else {
            throw IllegalArgumentException("${MainActivity::class.java.name} Intent is missing $STRING_KEY in bundle")
        }
    }

    companion object {
        private const val STRING_KEY = "stringKey"

        fun createIntent(context: Context, string: String) = Intent(context, MainActivity::class.java)
            .apply { putExtra(STRING_KEY, string) }
    }
}
