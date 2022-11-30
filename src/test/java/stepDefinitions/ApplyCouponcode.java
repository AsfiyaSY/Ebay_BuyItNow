package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;

public class ApplyCouponcode {
	WebDriver driver;
	 WebDriverWait wait;
	@Given("User adds coupon code")
	public void user_adds_coupon_code() {
		driver.findElement(By.xpath("//input[@id='redemptionCode']")).sendKeys("gabhijs");
		driver.findElement(By.xpath("//button[@data-test-id='INCENTIVES_ADD_BUTTON']")).click();
	}
	@Given("User redeems coupon code")
	public void user_redeems_coupon_code() {
		driver.findElement(By.xpath("//input[@id='redemptionCode']")).sendKeys("gabhijs");
		}
	

	@Given("user clicks on continue")
	public void user_clicks_on_continue() {
		driver.findElement(By.xpath("//button[@data-test-id='INCENTIVES_ADD_BUTTON']")).click();
	} 

}
