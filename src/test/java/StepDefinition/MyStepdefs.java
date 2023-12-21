package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilties.Locators;

public class MyStepdefs extends Locators {
    public static String bookName,bookPrice;
    @Given("Go to Practice Automation webapp")
    public void goToPracticeAutomationWebapp() {
        setUp("chrome");
    }
    @Then("Assert {string} book exists with its price")
    public void assertBookExistsWithItsPrice(String bookName) {
        MyStepdefs.bookName =bookName;
        Assert.assertTrue(driver.findElement(BookTitle).isDisplayed());
        Assert.assertTrue(driver.findElement(BookTitle).getText().contains(bookName));
        Assert.assertTrue(driver.findElement(BookPrice).isDisplayed());
        bookPrice=driver.findElement(BookPrice).getText();
    }
    @Then("Close the webapp")
    public void closeTheWebapp() {
        tearDown();
    }
    @Then("Click on Add to Basket for Thinking in HTML book")
    public void clickOnAddToBasketForThinkingInHTMLBook() {
        driver.findElement(AddToBasket).click();
    }
    @Then("Assert the book is added to the basket")
    public void assertTheBookIsAddedToTheBasket(){
        waitForVisibilityOfElement(driver.findElement(ViewBasketText));
        Assert.assertTrue(driver.findElement(ViewBasketText).isDisplayed());
    }
    @Then("Click on shopping cart")
    public void clickOnShoppingCart() {
        driver.findElement(ShoppingCart).click();
    }
    @Then("Assert the book is added to cart with its details")
    public void assertTheBookIsAddedToCartWithItsDetails() {
        waitForVisibilityOfElement(driver.findElement(ProductTitle));
        Assert.assertEquals(driver.findElement(ProductTitle).getText(), bookName);
        Assert.assertTrue(driver.findElement(ProductPrice).getText().contains(bookPrice));
    }
    @Then("Click on Proceed to Checkout")
    public void clickOnProceedToCheckout() {
        driver.findElement(ProceedToCheckoutBTN).click();
    }
    @Then("Assert Billing Details form displayed")
    public void assertBillingDetailsFormDisplayed() {
        Assert.assertTrue(driver.findElement(BillingFormHeader).getText().contains("Billing Details"));
    }
}
