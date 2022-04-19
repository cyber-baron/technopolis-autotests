package Tests.Settings;
import TestPages.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SettingsTest {

    @DisplayName("Test of login on ok.ru")
    @Test
    public void Test1(){
        SettingsPage page = new SettingsTest(driver).changeNameTest(usernameRus, true);
        page = new SettingsTest(driver).changeNameTest(usernameEng, true);
        new SettingsTest(driver).changeNameTest(emptyStr, false);
    }
}