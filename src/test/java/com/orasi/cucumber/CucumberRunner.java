package com.orasi.cucumber;

import org.testng.annotations.Parameters;

import com.orasi.web.OrasiDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features/"}, glue = "com.orasi.cucumber.steps")
public class CucumberRunner extends com.orasi.cucumber.utils.AbstractTestNGChameleonCucumberTest{


}