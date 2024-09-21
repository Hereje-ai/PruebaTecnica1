package co.com.serenity.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PurchaseCompleted extends PageObject {
    public static final Target INPUT_COUPON = Target.the("Input ¿Tienes un cupón?").located(By.xpath("//div[@class='woocommerce-form-coupon-toggle']//div[@class='woocommerce-info']"));
    public static final Target TXT_FINISH_PURCHASE = Target.the("Texto Compra finalizada").located(By.xpath("//h1[normalize-space()='Finalizar compra']"));
}
