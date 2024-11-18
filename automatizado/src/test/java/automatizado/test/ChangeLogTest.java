package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.page.LoginPO;
import io.github.cdimascio.dotenv.Dotenv;
import automatizado.page.ChangeLogPO;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class ChangeLogTest extends BaseTest{

    private static LoginPO loginPage;
    private static ChangeLogPO changeLogPage;

    @BeforeAll
    public static void prepararTests(){
        Dotenv dotenv = Dotenv.configure()
                              .directory("../.env")
                              .load();

        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar(dotenv.get("USER_NAME"), dotenv.get("PASSWORD"));
        loginPage.esperarElementoVisivel(loginPage.loginSuccess);
        changeLogPage = new ChangeLogPO(driver);
    }
    
    @Test 
    public void TC001_deveEstarNoMenuChangeLog(){

        changeLogPage.clicarBotaoMenuReportIssue();

        String resultado = "No Change Log information available";

        assertEquals(changeLogPage.obterTitulo(), resultado);
    }
}
