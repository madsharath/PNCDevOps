package org.example.PNCDevOps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(plugin={"json:target/cucumber.json"},features={"C:\\JogaDevOps\\PNCDevOps\\Resources\\LoginTest.feature"})
public class RunCukesTest {
}
