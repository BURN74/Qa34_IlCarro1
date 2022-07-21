package tests;

import org.testng.annotations.Test;

public class LoginTests extends TastBase {

    @Test
    public void  loginSuccess(){
        openLoginForm();
        fillLoginForm("noa@gmail.com","Nnoa12345$");
        submitLogin();


    }




}
