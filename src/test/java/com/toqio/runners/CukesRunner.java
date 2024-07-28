package com.toqio.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/toqio/step_definitions",
        dryRun = false,
        tags = "@languages"

)

public class CukesRunner {

}
