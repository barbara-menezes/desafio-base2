package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.page.LoginPO;
import automatizado.page.MyViewPO;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class MyViewTest extends BaseTest{

     private static LoginPO loginPage;
     private static MyViewPO myViewPage;

    @BeforeAll
    public static void prepararTests(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar("Barbara_Menezes", "Test");
        loginPage.esperarElementoVisivel(loginPage.loginSuccess);
        myViewPage = new MyViewPO(driver);
    }
    
    @Test 
    public void TC001_deveEstarNoMenuChangeLog(){

        myViewPage.clicarBotaoMenuMyView();

        String resultado = "Timeline";

        assertEquals(myViewPage.obterTitulo(), resultado);
    }
    
}
