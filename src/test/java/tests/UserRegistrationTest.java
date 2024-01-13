    package tests;
    import org.testng.annotations.Test;
    import pages.HomePage;
    import pages.LoginPage;
    import pages.UserRegistrationPage;

    public class UserRegistrationTest extends TestBase
    {
        HomePage homePageObject;
        LoginPage loginObject;
        UserRegistrationPage registerObject;
        String email = "ibrahimzamlyyy000@gmail.com";
        String password = "1234567890";
        @Test(priority =1)
        public void UserCanRegisterSuccessfully()
        {
            homePageObject = new HomePage(driver);
            homePageObject.openRegistrationPage();
            registerObject = new UserRegistrationPage(driver);
            registerObject.UserRegistration("Ibrahim","Elzamly",email,password);
        }

        @Test(priority = 2)
        public void RegisteredUserCanLogin() throws InterruptedException {
            homePageObject = new HomePage(driver);
            homePageObject.userCanClickOnHomepageBtn();
            homePageObject.openLoginPage();
            loginObject = new LoginPage(driver);
            loginObject.UserLogin(email,password);
        }

//        @Test(priority = 3)
//        public void RegisteredUserCanLogout() throws InterruptedException {
//            Thread.sleep(2000);
//            registerObject.userLogout();
//        }


    }
