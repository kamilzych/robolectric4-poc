package com.kz.robolectric4

import android.content.Intent
import androidx.test.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    val activityRule = object : ActivityTestRule<MainActivity>(MainActivity::class.java) {
        override fun getActivityIntent(): Intent {
            val context = InstrumentationRegistry.getTargetContext()
            return MainActivity.createIntent(context, "foo")
        }
    }

    @Test
    fun start() {
        //do nothing, activityRule will launch the Intent
    }
}
