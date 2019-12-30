package pe.com.vivanda.www.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\java\\pe\\com\\vivanda\\www\\feature\\agregar_producto.feature",
        glue = "pe.com.vivanda.www.definition",
        snippets = SnippetType.CAMELCASE)
public class BuscarProductoRunner {

}
