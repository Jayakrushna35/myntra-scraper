package com.example.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/example/features",
    glue = "com.example.steps",
    plugin = {"pretty"}
)
public class TestRunner {
}

