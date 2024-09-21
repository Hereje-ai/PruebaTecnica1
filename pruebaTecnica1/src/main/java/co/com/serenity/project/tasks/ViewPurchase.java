package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.PurchaseCompleted.INPUT_COUPON;

public class ViewPurchase implements Task {
    public static ViewPurchase choose() {
        return Tasks.instrumented(ViewPurchase.class);
    }

    @Override
    @Step("{0} ver los elementos añadidos al carritos") //Anotaciones que quedan en el reporte, es un indicio de lo que hace el código escrito
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(INPUT_COUPON));
    }
}
