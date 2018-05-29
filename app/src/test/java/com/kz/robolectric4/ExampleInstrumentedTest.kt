package com.kz.robolectric4

import android.content.Intent
import androidx.test.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule
import org.robolectric.Robolectric



@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun start() {
        val context = InstrumentationRegistry.getTargetContext()
        Robolectric.buildActivity(MainActivity::class.java, MainActivity.createIntent(context, "foo")).create().get()
    }
}
