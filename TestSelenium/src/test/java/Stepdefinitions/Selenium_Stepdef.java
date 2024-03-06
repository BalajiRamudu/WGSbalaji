package Stepdefinitions;

import api.customer.Selenium;
import cucumber.api.java.en.When;

public class Selenium_Stepdef {
    @When("open the chrome browser")
    public void openTheChromeBrowser() {
        Selenium.openBrowser();
    }
}
