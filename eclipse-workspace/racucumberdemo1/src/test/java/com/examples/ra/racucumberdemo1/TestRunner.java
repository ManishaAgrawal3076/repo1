package com.examples.ra.racucumberdemo1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\features\\apitest.feature",glue = "stepdefinitions")
public class TestRunner {

}
