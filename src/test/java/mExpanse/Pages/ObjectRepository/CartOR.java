package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class CartOR {
    public static class Locator{
        public static By FeaturesItems = By.xpath("//H2[@class='title text-center'][text()='Features Items']");
        public static By AddToCart = By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");
        public static By ViewCart = By.xpath("//U[text()='View Cart']");
        public static By ShoppingCart = By.xpath("//LI[@class='active'][text()='Shopping Cart']");
        public static By ProceedToCheckout = By.xpath("//A[@class='btn btn-default check_out'][text()='Proceed To Checkout']");
        public static By Register = By.xpath("//U[text()='Register / Login']");
        public static By Name = By.xpath("//INPUT[@type='text']");
        public static By email = By.xpath("(//INPUT[@type='email'])[2]");
        public static By SignUp = By.xpath("//BUTTON[@type='submit'][text()='Signup']");
        public static By Title = By.xpath("//INPUT[@id='id_gender1']");
        public static By Password = By.xpath("//INPUT[@id='password']");
        public static By Day = By.xpath("//SELECT[@id='days']");
        public static By Month = By.xpath("//SELECT[@id='months']");
        public static By Year = By.xpath("//SELECT[@id='years']");
        public static By FirstName = By.xpath("//INPUT[@id='first_name']");
        public static By LastName = By.xpath("//INPUT[@id='last_name']");
        public static By Address = By.xpath("//INPUT[@id='address1']");
        public static By Country = By.xpath("//SELECT[@id='country']");
        public static By State = By.xpath("//INPUT[@id='state']");
        public static By City = By.xpath("//INPUT[@id='city']");
        public static By Zip = By.xpath("//INPUT[@id='zipcode']");
        public static By Mobile = By.xpath("//INPUT[@id='mobile_number']");
        public static By CreateAcc = By.xpath("//BUTTON[@type='submit'][text()='Create Account']");
        public static By AccCreated = By.xpath("//B[text()='Account Created!']");
        public static By Continue = By.xpath("//A[@href='/'][text()='Continue']");
        public static By Username = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a");
        public static By Cart = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a");
        public static By Description = By.xpath("//TEXTAREA[@class='form-control']");
        public static By PlaceOrder = By.xpath("//A[@href='/payment'][text()='Place Order']");
        public static By NameCard = By.xpath("//INPUT[@class='form-control']");
        public static By CardNum = By.xpath("//INPUT[@name='card_number']");
        public static By CVC = By.xpath("//INPUT[@name='cvc']");
        public static By MM = By.xpath("//INPUT[@class='form-control card-expiry-month']");
        public static By YYYY = By.xpath("//INPUT[@name='expiry_year']");
        public static By Confirm = By.xpath("//BUTTON[@id='submit']");

        public static By Msg = By.xpath("/html/body/section/div/div/div/p");


    }

    public static class UIElements{
        public static String FeaturesItems = "FEATURES ITEMS";
        public static String ShoppingCart = "Shopping Cart";
        public static String AccCreated = "ACCOUNT CREATED!";

        public static String Msg = "Congratulations! Your order has been confirmed!";
    }
}
