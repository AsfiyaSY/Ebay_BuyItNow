package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
 
public class Payment {
	WebDriver driver;
	 WebDriverWait wait;
	 @Given("select payment option as Pay with creditordebit card")
	 public void select_payment_option_as_pay_with_creditordebit_card() {
			//payment_with_credit/debitcard
			driver.findElement(By.xpath("//input[@id='selectable-render-summary2741']")).click();
	 }

	 @Given("User clicks on sbmit button")
	 public void user_clicks_on_sbmit_button() {
		 driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	 }

	@And("add valid credentials")
	public void add_valid_credentials() {
		driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("12588523698");
		driver.findElement(By.xpath("//input[@id='cardExpiryDate']")).sendKeys("14-05-2023");
		driver.findElement(By.xpath("//input[@id='securityCode']")).sendKeys("5264");
		

	}


}
