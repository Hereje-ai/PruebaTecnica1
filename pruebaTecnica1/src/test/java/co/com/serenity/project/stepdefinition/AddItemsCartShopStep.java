package co.com.serenity.project.stepdefinition;

import co.com.serenity.project.questions.ValidateTitleFinishPurchase;
import co.com.serenity.project.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.serenity.project.utils.Constants.ACTOR;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static co.com.serenity.project.utils.DataFaker.fakerNumberOneAndSix;
import static co.com.serenity.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@Slf4j
public class AddItemsCartShopStep {
    @And("selecciona aleatoriamente el primer producto, define la cantidad {int} y lo añade al carrito")
    public void seleccionaAleatoriamenteElPrimerProductoDefineLaCantidadYLoAñadeAlCarrito(int cantidad) {
        String cantidadString = String.valueOf(cantidad);
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseOptionShop.witchParams(fakerNumberOneAndSix()));
        OnStage.theActorCalled(ACTOR).attemptsTo(SelectSendDate.choose());

        OnStage.theActorCalled(ACTOR).wasAbleTo(AddItemCart.witchParams(cantidadString));
        OnStage.theActorCalled(ACTOR).attemptsTo(GoHome.choose());
    }

    @When("selecciona aleatoriamente el segundo producto, define la cantidad {int} y lo añade al carrito")
    public void seleccionaAleatoriamenteElSegundoProductoDefineLaCantidadCincoYLoAñadeAlCarrito(int cantidad) {
        String cantidadString = String.valueOf(cantidad);
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseOptionShop.witchParams(fakerNumberOneAndSix()));
        OnStage.theActorCalled(ACTOR).attemptsTo(SelectSendDate.choose());

        OnStage.theActorCalled(ACTOR).wasAbleTo(AddItemCart.witchParams(cantidadString));
        waiting(TIME_SHORT);
    }

    @Then("visualizara en la cabecera el titulo finalizar compra")
    public void visualizaraEnLaCabeceraElTitulo() {
        String validateText = "Finalizar compra";
        if (validateText != null) {
            log.info(validateText);
        }
        theActorInTheSpotlight().should(seeThat(ValidateTitleFinishPurchase.withParams(validateText)));
        waiting(TIME_SHORT);
        OnStage.theActorCalled(ACTOR).attemptsTo(ViewPurchase.choose());
        waiting(TIME_SHORT);
    }
}
