package Tests.LogIn;

import TestPages.*;
import Tests.BaseTest;
import Utiles.User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {

    public static WebDriver driver;
    private static User user;

    @BeforeAll
    static void init(){
        user = new User("Надя Николаева", "login", "password");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ok.ru/");
    }

    @DisplayName("Test of login on ok.ru")
    @Test
    public void LogInTest(){
        DefaultPage page = new LoginPage().doLogin(user);
        assertEquals(page.getName(), user.getFullName(), "Access denied");
    }
}
