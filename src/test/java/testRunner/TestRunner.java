package testRunner;
import io.cucumber.junit.CucumberOptions;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
       // plugin = {"pretty"},
        features= {".//Features"},
		glue= {"stepDefinations"},
		dryRun = false,
		// for  Reports
         plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        		},
		 publish = true,
		 monochrome=true
		 
		
		
		
)
public class TestRunner {



}


