import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefaultPage {

    public void clickOnElement(WebDriver driver, String XPATH){
        int attempt = 0;

        while(attempt < 2) {
            try {
                driver.findElement(By.xpath(XPATH)).click();
                break;
            } catch(Exception e) {
            }
            attempt++;
        }
    }

    public void changeField(WebDriver driver, String FIELD_LOCATOR, String newValue) {
        driver.findElement(By.xpath(FIELD_LOCATOR)).clear();
        driver.findElement(By.xpath(FIELD_LOCATOR)).sendKeys(newValue);
    }
}