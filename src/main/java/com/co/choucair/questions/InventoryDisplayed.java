package com.co.choucair.questions;

import com.co.choucair.userinterfaces.InventoryPage;
import net.serenitybdd.screenplay.Question;

public class InventoryDisplayed {

    private InventoryDisplayed() {}

    public static Question<Boolean> isVisible() {

        return actor ->
                InventoryPage.TITLE.resolveFor(actor)
                        .getText()
                        .equals("Products");
    }
}
