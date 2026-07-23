package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Checkout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue("Juan")
                        .into(CheckoutPage.TXT_FIRST_NAME),

                Enter.theValue("Pérez")
                        .into(CheckoutPage.TXT_LAST_NAME),

                Enter.theValue("150001")
                        .into(CheckoutPage.TXT_POSTAL_CODE),

                Click.on(CheckoutPage.BTN_CONTINUE)

        );

    }

    public static Checkout withData() {
        return Tasks.instrumented(Checkout.class);
    }

}