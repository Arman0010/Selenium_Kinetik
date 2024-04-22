package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.Cart_Impl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class CartTC extends BaseClass{
    Cart_Impl obj= new Cart_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test
    public void Cart() throws InterruptedException {
        obj.cart(driver);
    }

    @AfterClass
    public void  testCaseTearDown() {
        tearDown();
    }
}
