package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static tests.TestBase.driver;
import static tests.TestBase.waitForVisibilityOfElement;
public class HomePage {
    public void AddToBasket(By AddToBasket){
        driver.findElement(AddToBasket).click();
    }
    public void assertBookExists(By BookTitle, String EcpectedBookName){
        Assert.assertTrue(driver.findElement(BookTitle).isDisplayed());
        Assert.assertTrue(driver.findElement(BookTitle).getText().contains(EcpectedBookName));
    }
    public void assertPriceExists(By BookPrice){
        Assert.assertTrue(driver.findElement(BookPrice).isDisplayed());
    }
    public String getBookPrice(By BookPrice){
        return driver.findElement(BookPrice).getText();
    }
    public void assertViewBasketAppeared(By ViewBasketText)
    {
        waitForVisibilityOfElement(driver.findElement(ViewBasketText),10);
        Assert.assertTrue(driver.findElement(ViewBasketText).isDisplayed());
    }
    public void ClickOnShoppingCart(By ShoppingCart){
        driver.findElement(ShoppingCart).click();
    }

}
