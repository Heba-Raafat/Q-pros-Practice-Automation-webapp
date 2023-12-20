package utilties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.TestBase;

public class Locators extends TestBase {
    protected By BookTitle =By.id("text-22-sub_row_1-0-2-1-0");
    protected By BookPrice = By.xpath("//*/ins/span");
    protected By AddToBasket = By.xpath("//*[@id='text-22-sub_row_1-0-2-1-0']/div/ul/li/a[2]");
    protected By ViewBasketText = By.xpath("//*[@title='View Basket']");
    protected By ShoppingCart = By.xpath("//*[@class='wpmenucart-icon-shopping-cart-0']");
    protected By ProductTitle = By.xpath("//*[@data-title='Product']");
    protected By ProductPrice = By.xpath("//*[@data-title='Price']");
    protected By ProceedToCheckoutBTN =By.xpath("//*[@class='checkout-button button alt wc-forward']");
    protected By BillingFormHeader =By.xpath("//*[@class='woocommerce-billing-fields']");
}
