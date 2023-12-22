package StepDefinition;

import Pages.HomePage;
import Pages.ShoppingCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilties.Locators;

public class MyStepdefs extends Locators {
    public static String bookName,bookPrice;
    HomePage homePage = new HomePage();
    ShoppingCart shoppingCartPage = new ShoppingCart();
    @Given("Go to Practice Automation webapp")
    public void goToPracticeAutomationWebapp() {
        setUp("chrome");
    }
    @Then("Assert {string} book exists with its price")
    public void assertBookExistsWithItsPrice(String BookName) {
        homePage.assertBookExists(BookTitle,BookName);
        homePage.assertPriceExists(BookPrice);
        bookPrice= homePage.getBookPrice(BookPrice);
        bookName =BookName;
    }
    @Then("Click on Add to Basket for Thinking in HTML book")
    public void clickOnAddToBasketForThinkingInHTMLBook() {
        homePage.AddToBasket(AddToBasket);
    }
    @Then("Assert the book is added to the basket")
    public void assertTheBookIsAddedToTheBasket() {
        homePage.assertViewBasketAppeared(ViewBasketText);
    }
    @Then("Click on shopping cart")
    public void clickOnShoppingCart() {
        homePage.ClickOnShoppingCart(ShoppingCart);
    }
    @Then("Assert the book is added to cart with its details")
    public void assertTheBookIsAddedToCartWithItsDetails() {
        shoppingCartPage.assertBookTitleIsCorrectInCart(ProductTitle,bookName);
        shoppingCartPage.assertBookPriceIsCorrectInCart(ProductPrice,bookPrice);
    }
    @Then("Click on Proceed to Checkout")
    public void clickOnProceedToCheckout() {
        shoppingCartPage.clickOnProceedToCheckout(ProceedToCheckoutBTN);
    }
    @Then("Assert Billing Details form displayed")
    public void assertBillingDetailsFormDisplayed() {
        shoppingCartPage.assertBillingDetailsTitleExists(BillingFormHeader);
    }
    @Then("Close the webapp")
    public void closeTheWebapp() {
        tearDown();
    }
}
