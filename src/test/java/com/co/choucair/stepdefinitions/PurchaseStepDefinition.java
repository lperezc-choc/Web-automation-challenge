package com.co.choucair.stepdefinitions;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.questions.PurchaseCompleted;
import com.co.choucair.tasks.AddProduct;
import com.co.choucair.tasks.Checkout;
import com.co.choucair.tasks.FinishPurchase;
import com.co.choucair.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PurchaseStepDefinition {

    @Managed
    WebDriver browser;

    Actor juan = Actor.named("Juan");

    @Before
    public void setUp() {
        juan.can(BrowseTheWeb.with(browser));
    }

    @Given("que el usuario inicia una compra en SauceDemo")
    public void abrirSauceDemo() {
        browser.get("https://www.saucedemo.com/");
    }

    @When("realiza la compra de un producto")
    public void comprarProducto() {

        UserLoombokData user = new UserLoombokData();
        user.setUser("standard_user");
        user.setPass("secret_sauce");

        juan.attemptsTo(
                Login.onTheSite(user),
                AddProduct.toCart(),
                Checkout.withData(),
                FinishPurchase.now()
        );
    }

    @Then("debe finalizar la compra correctamente")
    public void validarCompra() {

        juan.should(
                seeThat(PurchaseCompleted.isSuccessful())
        );
    }
}