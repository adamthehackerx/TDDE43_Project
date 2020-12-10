package com.example.tdde43_project;

import android.os.SystemClock;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.Espresso.onView;



/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivitySR =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testingForRedPassword() {
            String testPassword = "adam";
            onView(withId(R.id.password)).perform(typeText(testPassword), closeSoftKeyboard());
            SystemClock.sleep(1000);
            onView(withId(R.id.button)).perform(click());
            SystemClock.sleep(1000);
            onView(withId(R.id.password)).check(matches(withHint("You need a stronger password")));
    }

    @Test
    public void testingForOrangePassword() {
        String testPassword = "Adam";
        onView(withId(R.id.password)).perform(typeText(testPassword), closeSoftKeyboard());
        SystemClock.sleep(1000);
        onView(withId(R.id.button)).perform(click());
        SystemClock.sleep(1000);
    }

    @Test
    public void testingForYellowPassword() {
        String testPassword = "Adam1";
        onView(withId(R.id.password)).perform(typeText(testPassword), closeSoftKeyboard());
        SystemClock.sleep(1000);
        onView(withId(R.id.button)).perform(click());
        SystemClock.sleep(1000);
    }

    @Test
    public void testingForGreenPassword() {
        String testPassword = "Adam123";
        onView(withId(R.id.password)).perform(typeText(testPassword), closeSoftKeyboard());
        SystemClock.sleep(1000);
        onView(withId(R.id.button)).perform(click());
        SystemClock.sleep(2000);
    }
}