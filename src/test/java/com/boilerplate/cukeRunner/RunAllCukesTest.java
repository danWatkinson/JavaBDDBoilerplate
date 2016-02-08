package com.boilerplate.cukeRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = { "com.boilerplate.stepDefinitions"},
        features = { "classpath:cucumber/" },
        tags = {"~@WIP"}
)

public class RunAllCukesTest {}
