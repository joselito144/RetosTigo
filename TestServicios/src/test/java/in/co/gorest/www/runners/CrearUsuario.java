package in.co.gorest.www.runners;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\main\\resources\\in\\co\\gorest\\www\\features\\test_servicios.feature",
        glue = "in.co.gorest.www.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CrearUsuario {

}
