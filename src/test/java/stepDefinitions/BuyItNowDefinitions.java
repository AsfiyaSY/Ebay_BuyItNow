package stepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BuyItNowDefinitions {
 WebDriver driver;
  WebDriverWait wait;
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	   
	}

	@Given("Web application should be displayed")
	public void web_application_should_be_displayed() {
		driver.get("https://www.ebay.com/");
	}

	@And("search for the product")
	public void search_for_the_product() {
		 wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("_nkw")))).sendKeys("book");
	}

	@And("User clicks on Search button")
	public void user_clicks_on_search_button() {
		driver.findElement(By.id("gh-btn")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0,600)");
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[text()='Scooters'])[3]"))));
	    js.executeScript("window.scrollTo(0,600)");
	    driver.findElement(By.xpath("//img[@alt='Slaughterhouse-Five by Vonnegut Jr., Kurt']")).click();
	
	    String parentWindowId = driver.getWindowHandle();
		System.out.println("parentWindowId = " + parentWindowId);
		
		
		Set<String> allwindowIds = driver.getWindowHandles();
		System.out.println("windowCount = " + allwindowIds.size());
		System.out.println("allwindowIds = " + allwindowIds);
		System.out.println("------------------------");
	    
		for (String wid : allwindowIds) {
			System.out.println(wid);
			String windowUrl = driver.switchTo().window(wid).getCurrentUrl();
			if (windowUrl.equals("https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=mobile&_sacat=0")) {
				
			}}
		}
	


	@Then("User is able to see BuyItNow option")
	public void user_is_able_to_see_buy_it_now_option() {
		//click on buy it now
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("binBtn_btn_1")))).click();

	}
	
	@And("User is able to checkout as Guest")
	public void user_is_able_to_checkout_as_guest() {
		driver.findElement(By.xpath("(//a[@data-testid='ux-call-to-action'])[3]")).click();
	}
	

	@And("User adds shipping adress")
	public void user_adds_shipping_adress() {
		 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Asfiya");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("S Y");
			driver.findElement(By.xpath("//input[@id='addressLine1']")).sendKeys("#1569,17th A main,5th block,HBR Layout,Bengaluru");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bengaluru");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asfisy97@gmail.com");
			driver.findElement(By.xpath("//input[@id='emailConfirm']")).sendKeys("asfisy97@gmail.com");
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8861117397");
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	@And("select Payment Option")
		public void select_payment_option() {
		//payment_with_Googlepay
				driver.findElement(By.cssSelector("input[id='selectable-render-summary4']")).click();
				
		}


	@And("click on continue")
	public void click_on_continue() {
		driver.findElement(By.xpath("//input[@value='GOOGLE_PAY']']")).click();
		
		driver.findElement(By.cssSelector("//button[text()='Continue in USD']")).click();
	}


}