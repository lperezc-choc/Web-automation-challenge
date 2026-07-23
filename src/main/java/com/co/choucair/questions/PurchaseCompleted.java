package com.co.choucair.questions;

import com.co.choucair.userinterfaces.CompletePage;
import net.serenitybdd.screenplay.Question;

public class PurchaseCompleted {

    private PurchaseCompleted() {
    }

    public static Question<Boolean> isSuccessful() {

        return actor ->
                CompletePage.TXT_COMPLETE.resolveFor(actor)
                        .getText()
                        .equals("Thank you for your order!");
    }
}