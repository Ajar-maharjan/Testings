package com.pepo.unittesting;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Divtesting {
    @Rule
    public ActivityTestRule<Testing> testRule = new ActivityTestRule<>(Testing.class);

    private String expectedResult = "5.0";

    @Test
    public void AddUItest() throws Exception {
        onView(withId(R.id.etno1)).perform(typeText("10"));
        onView(withId(R.id.etno2)).perform(typeText("2"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText(expectedResult)));
    }
}
