package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletePage {

    public static final Target BTN_FINISH =
            Target.the("Botón Finish")
                    .located(By.id("finish"));

    public static final Target TXT_COMPLETE =
            Target.the("Mensaje de compra exitosa")
                    .located(By.className("complete-header"));
}