package com.dicoding.academies.moviecataloguedatamanagement.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.dicoding.academies.moviecataloguedatamanagement.R
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SplashScreenActivityTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(SplashScreenActivity::class.java)
    }

    @Test
    fun loadSplashScreen() {
        onView(withId(R.id.riv_tmdb_logo)).check(matches(isDisplayed()))
        onView(ViewMatchers.withText("MOVIE CATALOGUES")).check(matches(isDisplayed()))
    }
}