package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.ItemDescription.BTN_DAY;
import static co.com.serenity.project.ui.ItemDescription.BTN_HOUR;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SelectSendDate implements Task {
    @Override
    @Step("{0} selecciona una fecha y una hora para la entrega") //Anotaciones que quedan en el reporte, es un indicio de lo que hace el código escrito
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(BTN_DAY, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_DAY));
        actor.attemptsTo(WaitUntil.the(BTN_HOUR, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_HOUR));
    }
    public static SelectSendDate choose(){
        return Tasks.instrumented(SelectSendDate.class);
    }
}
