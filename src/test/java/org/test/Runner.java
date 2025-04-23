package org.test;

import org.base.JvmReportGenerate;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.step",snippets=SnippetType.CAMELCASE,dryRun=false,
plugin= {"html:target","json:target/fb.json","junit:target/facebook.xml"})
public class Runner {
@AfterClass
public static void afterLaunch() {
	JvmReportGenerate.generateJvmReport(System.getProperty("user.dir")+"\\target\\fb.json");
}
}
















//plugin=(rerun:Rerun/FailedScenarios.txt)