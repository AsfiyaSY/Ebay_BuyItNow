package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.CheckOutAsGuest;

public class CheckOutAsGuestTest extends Base_Test {
	@Test(dataProvider = "testdata")
	public void BuyItNow(String book) {
		CheckOutAsGuest guest = new CheckOutAsGuest(driver);
		guest.enter_product(book);
		guest.ClickonSearch();
		guest.ClickonSearchedProduct();
		guest.ClickonBuyItNow();
		guest.ClickonCheckoutAsGuest();
		guest.ClickonPayWithGooglepay();
	}

	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object[][] testdata = ReadExcel.getMultipleData("Sheet1");
		return testdata;

	}
}
