package co.com.serenity.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;


import static co.com.serenity.project.ui.ItemDescription.*;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static co.com.serenity.project.utils.Time.waiting;

@AllArgsConstructor
public class AddItemCart implements Task {
    private final String cantidad;
    @Override
    @Step("{0} añade una opcion de compra con una cantidad definida") //Anotaciones que quedan en el reporte, es un indicio de lo que hace el código escrito
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(INPUT_CANTIDAD), Enter.theValue(cantidad).into(INPUT_CANTIDAD));
        actor.attemptsTo(Click.on(BTN_ADDCART));
        waiting(TIME_SHORT);
    }

    public static AddItemCart witchParams(String cantidad) {
        return Tasks.instrumented(AddItemCart.class, cantidad);
    }
}
