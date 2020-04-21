package com.reamu.acucumber.test;

import junit.framework.TestCase;

import cucumber.api.CucumberOptions;


@CucumberOptions(
        features = { "features" },
        plugin = { "pretty" },
        glue = { "com.reamu.acucumber.steps" }
//        tags = { "@ui, @smoke, @acceptance" }
        )
public class CucumberRunner extends TestCase {
}
