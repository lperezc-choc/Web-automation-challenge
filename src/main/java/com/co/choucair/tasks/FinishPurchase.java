package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.CompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FinishPurchase implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CompletePage.BTN_FINISH)
        );

    }

    public static FinishPurchase now() {
        return Tasks.instrumented(FinishPurchase.class);
    }

}