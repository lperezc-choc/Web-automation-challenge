package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME =
            Target.the("Campo usuario")
                    .located(By.id("user-name"));

    public static final Target PASSWORD =
            Target.the("Campo contraseña")
                    .located(By.id("password"));

    public static final Target LOGIN_BUTTON =
            Target.the("Botón Login")
                    .located(By.id("login-button"));

}