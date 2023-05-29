package com.demoblaze.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@SmokeTest",
        glue = "com/demoblaze/stepsDefinitions",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class CarritoCompraRunner {

}
