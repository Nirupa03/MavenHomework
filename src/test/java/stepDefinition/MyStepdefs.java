package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.beans.value.WeakChangeListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    static WebDriver myDriver;

    @Given("^I am a Google chrome user$")
    public void i_am_a_Google_chrome_user()  {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\IdeaProjects\\MavenHomework\\src\\chromedriver.exe");
        myDriver = new ChromeDriver();

    }

    @When("^I access Booking website$")
    public void i_access_Booking_website() {
        // Write code here that turns the phrase above into concrete actions
        myDriver.get("https://www.booking.com/");

    }

    @Then("^I see booking\\.com webpage$")
    public void i_see_booking_com_webpage()  {
        // Write code here that turns the phrase above into concrete actions
        myDriver.quit();

    }
}
