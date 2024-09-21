package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.ItemDescription.*;
import static co.com.serenity.project.ui.ItemDescription.BTN_HOME;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class GoHome implements Task {
    public static GoHome choose() {
        return Tasks.instrumented(GoHome.class);
    }

    @Override
    @Step("{0} regresa a la página principal") //Anotaciones que quedan en el reporte, es un indicio de lo que hace el código escrito
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(BTN_HOME), Click.on(BTN_HOME));
    }
}
