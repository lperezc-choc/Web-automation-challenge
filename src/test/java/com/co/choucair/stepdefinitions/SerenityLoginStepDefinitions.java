package com.co.choucair.stepdefinitions;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.questions.InventoryDisplayed;
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

public class SerenityLoginStepDefinitions {

    @Managed
    WebDriver browser;

    Actor juan = Actor.named("Juan");

    @Before
    public void setUp() {
        juan.can(BrowseTheWeb.with(browser));
    }

    @Given("que el usuario abre SauceDemo")
    public void queJuanAbreSaucedemo() {
        browser.get("https://www.saucedemo.com/");
    }

    @When("ingresa sus credenciales")
    public void iniciaSesionConUsuarioValido() {

        UserLoombokData user = new UserLoombokData();
        user.setUser("standard_user");
        user.setPass("secret_sauce");

        juan.attemptsTo(
                Login.onTheSite(user)
        );
    }

    @Then("debe visualizar el inventario")
    public void debeVisualizarElInventario() {

        juan.should(
                seeThat(InventoryDisplayed.isVisible())
        );
    }
}