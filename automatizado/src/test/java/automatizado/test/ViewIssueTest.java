package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.page.LoginPO;
import automatizado.page.ViewIssuePO;
import io.github.cdimascio.dotenv.Dotenv;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class ViewIssueTest extends BaseTest{

     private static LoginPO loginPage;
     private static ViewIssuePO viewIssuePage;

    @BeforeAll
    public static void prepararTests(){
        Dotenv dotenv = Dotenv.configure()
                              .directory("../.env")
                              .load();

        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar(dotenv.get("USER_NAME"), dotenv.get("PASSWORD"));
        loginPage.esperarElementoVisivel(loginPage.loginSuccess);
        viewIssuePage = new ViewIssuePO(driver);
    }
    
    @Test 
    public void TC001_deveEstarNoMenuChangeLog(){

        viewIssuePage.clicarBotaoMenuViewIssue();

        String resultado = "Filters";

        assertEquals(viewIssuePage.obterTitulo(), resultado);
    }
    
}
