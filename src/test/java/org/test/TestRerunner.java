package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun/FailedScenarios.txt",glue="org.step",snippets=SnippetType.CAMELCASE,dryRun=false)
public class TestRerunner {

}
