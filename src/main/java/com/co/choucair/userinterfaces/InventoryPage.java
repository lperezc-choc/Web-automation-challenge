package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {

    public static final Target TITLE =
            Target.the("Título Products")
                    .located(By.className("title"));

    public static final Target BTN_ADD_BACKPACK =
            Target.the("Botón Agregar Backpack")
                    .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target BTN_CART =
            Target.the("Carrito de compras")
                    .located(By.className("shopping_cart_link"));
}