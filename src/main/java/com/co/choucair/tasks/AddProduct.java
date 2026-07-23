package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.CartPage;
import com.co.choucair.userinterfaces.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(InventoryPage.BTN_ADD_BACKPACK),

                Click.on(InventoryPage.BTN_CART),

                Click.on(CartPage.BTN_CHECKOUT)

        );

    }

    public static AddProduct toCart() {
        return Tasks.instrumented(AddProduct.class);
    }

}