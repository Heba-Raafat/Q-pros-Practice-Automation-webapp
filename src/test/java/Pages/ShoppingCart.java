package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static tests.TestBase.driver;
import static tests.TestBase.waitForVisibilityOfElement;

public class ShoppingCart {
    public void clickOnProceedToCheckout(By ProceedToCheckoutBTN){
        driver.findElement(ProceedToCheckoutBTN).click();
    }
    public void assertBookTitleIsCorrectInCart(By ProductTitle, String bookName){
        waitForVisibilityOfElement(driver.findElement(ProductTitle),5);
        Assert.assertEquals(driver.findElement(ProductTitle).getText(), bookName);
    }
    public void assertBookPriceIsCorrectInCart(By ProductPrice, String bookPrice){
        Assert.assertTrue(driver.findElement(ProductPrice).getText().contains(bookPrice));
    }
    public void assertBillingDetailsTitleExists(By BillingFormHeader){
        Assert.assertTrue(driver.findElement(BillingFormHeader).getText().contains("Billing Details"));
    }
}
