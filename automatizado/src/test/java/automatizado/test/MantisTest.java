package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MantisTest {

     protected static WebDriver driver;
    private static final String URL_BASE = "https://mantis-prova.base2.com.br/";
    private static final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver";
    
    @BeforeAll
    protected static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterAll
    protected static void finalizar(){
        driver.quit();
    }

    @Test
    public void deveAdicionarInputEmail(){
        driver.findElement(By.id("username"));
        driver.findElement(By.className("btn-success")).click();
        String alertMessage = driver.findElement(By.className("alert-danger")).getText();

        assertEquals(alertMessage, "Your account may be disabled or blocked or the username/password you entered is incorrect.");
    }
    
}
