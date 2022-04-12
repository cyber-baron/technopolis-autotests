import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Tests extends BaseTest {

    String username = "89218824786";
    String password = "rawery";

    @BeforeEach
    public void start() {
        driverInit();
        get();
    }

    @Test
    public void LogInTest(){
        DefaultPage page = new LoginPage(driver).doLogin(username, password);
        LoginPage loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void stop() {
        driverDown();
    }
}