package in.co.gorest.www.question;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElCodigoDe implements Question<Integer> {
	
    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getStatusCode();
    }

    public static Question<Integer> respuesta() {
        return new ElCodigoDe();
    }

}
