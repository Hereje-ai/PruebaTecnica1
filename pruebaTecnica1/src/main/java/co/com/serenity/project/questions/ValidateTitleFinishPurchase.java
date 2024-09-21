package co.com.serenity.project.questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


import static co.com.serenity.project.ui.PurchaseCompleted.TXT_FINISH_PURCHASE;


@Slf4j
@AllArgsConstructor
public class ValidateTitleFinishPurchase implements Question<Boolean> {
    private String validateTxtTitleFinishPurchase;

    public static ValidateTitleFinishPurchase withParams (String validateTxtTitleFinishPurchase) {
        return new ValidateTitleFinishPurchase(validateTxtTitleFinishPurchase);
    }

    @Override
    @Subject("{0} se realiza validacion del titulo que aparece cuando se finaliza una compra")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String validTextTitlePurchase = TXT_FINISH_PURCHASE.resolveFor(actor).getText();
        if (validTextTitlePurchase != null && validateTxtTitleFinishPurchase.equals(validTextTitlePurchase)) {
            log.info(validTextTitlePurchase);
            result = true;
        }else{
            result = false;
        }
        return result;
    }

}
