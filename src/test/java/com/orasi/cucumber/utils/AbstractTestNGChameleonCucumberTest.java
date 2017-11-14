package com.orasi.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orasi.web.OrasiDriver;
import com.orasi.web.WebBaseTest;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * Runs cucumber every detected feature as separated test
 */
public abstract class AbstractTestNGChameleonCucumberTest extends WebBaseTest{
	WebDriver driver;
   // private TestNGCucumberRunner testNGCucumberRunner;

    
    @BeforeTest(groups = { "regression", "interfaces", "button", "dev" })
    public void setup() {
        setApplicationUnderTest("Salesforce");
        setPageURL("about:blank");
        testStart("Functional Testing");
        //testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    }
    
    @AfterTest(groups = { "regression", "interfaces", "button", "dev" })
    public void close(ITestContext testResults) {
    	endTest("TestAlert", testResults);
        //testNGCucumberRunner.finish();

    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
    	OrasiDriver orasiDriver = getDriver();
    	String t = orasiDriver.getTitle();
    	DriverManager.setWebDriver(orasiDriver);
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    
     
    }

    /**
     * @return returns two dimensional array of {@link CucumberFeatureWrapper} objects.
     */
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

}
