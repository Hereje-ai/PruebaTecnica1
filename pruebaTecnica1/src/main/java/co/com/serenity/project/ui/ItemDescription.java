package co.com.serenity.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ItemDescription extends PageObject {
    public static final Target BTN_DAY = Target.the("Boton fecha de envío").locatedBy("//span[contains(text(),'Mañana')]");
    public static final Target BTN_HOUR = Target.the("Boton hora de envío").locatedBy("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/a[1]");
    public static final Target INPUT_CANTIDAD= Target.the("Cantidad de elementos a colocar dentro del producto").locatedBy("//*[@class='input-text qty text']");
    public static final Target BTN_ADDCART= Target.the("Botón de agregar carrito").located(By.xpath("//button[normalize-space()='Añadir al carrito']"));
    public static final Target BTN_HOME= Target.the("Elemento para redigir al usuario a la página principal").locatedBy("//a[@href='https://sanangel.com.co/']");
}
