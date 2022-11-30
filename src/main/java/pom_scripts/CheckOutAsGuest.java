package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutAsGuest extends BasePage {

	public CheckOutAsGuest(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "_nkw")
	WebElement productSearch;

	public void enter_product(String book) {
		enter_value(productSearch, book);
	}

	@FindBy(id = "gh-btn")
	WebElement Search;

	public void ClickonSearch() {
		clickAction(Search);
	}

	@FindBy(xpath = "//img[@alt='Slaughterhouse-Five by Vonnegut Jr., Kurt']")
	WebElement SearchedProduct;

	public void ClickonSearchedProduct() {
		clickAction(SearchedProduct);
	}

	@FindBy(id = "binBtn_btn_1")
	WebElement BuyItNow;

	public void ClickonBuyItNow() {
		clickAction(BuyItNow);
	}

	@FindBy(xpath = "//a[@data-testid='ux-call-to-action'])[3]")
	WebElement CheckoutAsGuest;

	public void ClickonCheckoutAsGuest() {
		clickAction(CheckoutAsGuest);
	}

	@FindBy(css = "input[value='GOOGLE_PAY']")
	WebElement PayWithGooglepay;

	public void ClickonPayWithGooglepay() {
		clickAction(PayWithGooglepay);
	}

}
