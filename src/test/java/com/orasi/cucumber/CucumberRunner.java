package com.orasi.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/orasi/features/"}, glue = "src/test/java/orasi/cucumber/steps")
public class CucumberRunner extends AbstractTestNGCucumberTests{

}