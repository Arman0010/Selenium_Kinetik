package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Cart_Interface;
import mExpanse.Pages.ObjectRepository.CartOR;
import org.openqa.selenium.WebDriver;

public class Cart_Impl implements Cart_Interface {

    @Override
    public void cart(WebDriver driver) throws InterruptedException {
        Operations.matchText(CartOR.Locator.FeaturesItems,CartOR.UIElements.FeaturesItems,driver);
        Operations.scrollIntoElement(CartOR.Locator.AddToCart,driver);
        Operations.click(CartOR.Locator.AddToCart,driver);
        Thread.sleep(2000);
        Operations.click(CartOR.Locator.ViewCart,driver);

        Operations.matchText(CartOR.Locator.ShoppingCart,CartOR.UIElements.ShoppingCart,driver);
        Operations.click(CartOR.Locator.ProceedToCheckout,driver);
        Operations.click(CartOR.Locator.Register,driver);
        Thread.sleep(2000);
        Operations.sendText(CartOR.Locator.Name,"arman",driver);
        Operations.sendText(CartOR.Locator.email,"arman10@test.com",driver);
        Operations.click(CartOR.Locator.SignUp,driver);
        Thread.sleep(2000);
        Operations.click(CartOR.Locator.Title,driver);
        Operations.sendText(CartOR.Locator.Password,"testpass",driver);
        Operations.randomDropdownSelect(CartOR.Locator.Day,driver);
        Operations.randomDropdownSelect(CartOR.Locator.Month,driver);
        Operations.randomDropdownSelect(CartOR.Locator.Year,driver);
        Operations.sendText(CartOR.Locator.FirstName,"Arman",driver);
        Operations.sendText(CartOR.Locator.LastName,"Test",driver);
        Operations.sendText(CartOR.Locator.Address,"Test Address",driver);
        Operations.randomDropdownSelect(CartOR.Locator.Country,driver);
        Operations.sendText(CartOR.Locator.State,"TestState",driver);
        Operations.sendText(CartOR.Locator.City,"TestCity",driver);
        Operations.sendText(CartOR.Locator.Zip,"1200",driver);
        Operations.sendText(CartOR.Locator.Mobile,"01712345678",driver);
        Operations.click(CartOR.Locator.CreateAcc,driver);
        Thread.sleep(2000);
        Operations.matchText(CartOR.Locator.AccCreated,CartOR.UIElements.AccCreated,driver);
        Operations.click(CartOR.Locator.Continue,driver);
        Operations.matchText(CartOR.Locator.Username,"Logged in as arman",driver);
        Operations.click(CartOR.Locator.Cart,driver);
        Operations.click(CartOR.Locator.ProceedToCheckout,driver);
        Thread.sleep(2000);
        Operations.sendText(CartOR.Locator.Description,"This is a test description",driver);
        Operations.click(CartOR.Locator.PlaceOrder,driver);
        Operations.sendText(CartOR.Locator.NameCard,"Arman Test",driver);
        Operations.sendText(CartOR.Locator.CardNum,"4637 6775 0148 3331",driver);
        Operations.sendText(CartOR.Locator.CVC,"860",driver);
        Operations.sendText(CartOR.Locator.MM,"11",driver);
        Operations.sendText(CartOR.Locator.YYYY,"2025",driver);
        Operations.click(CartOR.Locator.Confirm,driver);
        Thread.sleep(2000);
        Operations.matchText(CartOR.Locator.Msg,CartOR.UIElements.Msg,driver);

        Thread.sleep(3000);

    }

}
