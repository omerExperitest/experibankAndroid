package com.experitest.ExperiBank;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginFailTest1 {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void loginFailTest() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }
    @Test
    public void loginFailTest10() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }
    @Test
    public void loginFailTest6() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }
    @Test
    public void loginFailTest7() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }
    @Test
    public void loginFailTest8() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }
    @Test
    public void loginFailTest9() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }

    @Test
    public void loginFailTest5() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }

    @Test
    public void loginFailTest4() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }

    @Test
    public void loginFailTest3() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }

    @Test
    public void loginFailTest2() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }

    @Test
    public void loginFailTest1() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.usernameTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        1),
                                0)));
        editText2.perform(scrollTo(), replaceText("company"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.passwordTextField),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.makePaymentView),
                                        2),
                                0)));
        editText3.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.loginButton), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.makePaymentView),
                                        childAtPosition(
                                                withId(R.id.scrollView1),
                                                0)),
                                3)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
