package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.page.LoginPO;
import automatizado.page.ChangeLogPO;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class ChangeLogTest extends BaseTest{

    private static LoginPO loginPage;
    private static ChangeLogPO changeLogPage;

    @BeforeAll
    public static void prepararTests(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar("Barbara_Menezes", "Test");
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
