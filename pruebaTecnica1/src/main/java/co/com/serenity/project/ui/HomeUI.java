package co.com.serenity.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomeUI extends PageObject {
    public static final Target LIST_OPTION_SHOP = Target.the("lista de opciones de compra").located(By.xpath("//*[@id=\"destacados-tab\"]/div[2]/div/ul"));
    public static final Target OPTION_SHOP = Target.the("Opcion de compra").locatedBy("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']/img)[{0}]");

}
