package com.co.choucair.tasks;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.userinterfaces.InventoryPage;
import com.co.choucair.userinterfaces.LoginPage;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    private final UserLoombokData userLoombokData;

    public Login(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(LoginPage.USERNAME, isVisible())
                        .forNoMoreThan(10).seconds(),

                Enter.theValue(userLoombokData.getUser())
                        .into(LoginPage.USERNAME),

                Enter.theValue(userLoombokData.getPass())
                        .into(LoginPage.PASSWORD),

                Click.on(LoginPage.LOGIN_BUTTON),

                WaitUntil.the(InventoryPage.TITLE, isVisible())
                        .forNoMoreThan(10).seconds()
        );
    }

    public static Login onTheSite(UserLoombokData userLoombokData) {
        return Instrumented.instanceOf(Login.class)
                .withProperties(userLoombokData);
    }
}