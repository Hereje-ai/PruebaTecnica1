package co.com.serenity.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.HomeUI.LIST_OPTION_SHOP;
import static co.com.serenity.project.ui.HomeUI.OPTION_SHOP;

@AllArgsConstructor
public class ChooseOptionShop implements Task {
    private String numberRandomOption;

    public static ChooseOptionShop witchParams(String numberRandomOption) {
        return Tasks.instrumented(ChooseOptionShop.class, numberRandomOption);
    }

    @Override
    @Step("{0} añade una opcion de compra aleatoria") //Anotaciones que quedan en el reporte, es un indicio de lo que hace el código escrito
    public <T extends Actor> void performAs(T actor) {
        String number = numberRandomOption;
        //Aquí localiza el contenedor de los elementos ||  Aquí selecciona un elemento aleatorio llamando un numero entre los limites definidos
        actor.attemptsTo(Scroll.to(LIST_OPTION_SHOP), Click.on(OPTION_SHOP.of(number)));

    }
}
