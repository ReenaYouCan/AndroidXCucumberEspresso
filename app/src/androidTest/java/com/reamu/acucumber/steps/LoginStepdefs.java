package com.reamu.acucumber.steps;

import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import com.reamu.acucumber.MainActivity;

import cucumber.api.java.en.Given;

public class LoginStepdefs {
    ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Given("I am on login screen")
    public void iAmOnLoginScreen() {
        activityActivityTestRule.launchActivity(new Intent());
    }
}
