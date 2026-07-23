package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target BTN_CHECKOUT =
            Target.the("Botón Checkout")
                    .located(By.id("checkout"));

}
