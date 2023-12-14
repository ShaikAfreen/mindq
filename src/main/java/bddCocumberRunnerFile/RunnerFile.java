package bddCocumberRunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"feature"},
				 glue = {"stepDefination"},
				 plugin = {"pretty",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				 tags = "@smoke",
				 monochrome = true
		) 

public class RunnerFile extends AbstractTestNGCucumberTests{

}
