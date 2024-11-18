package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.page.LoginPO;
import automatizado.page.RoadmapPO;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class RoadmapTest extends BaseTest{

    private static LoginPO loginPage;
    private static RoadmapPO roadmapPage;

    @BeforeAll
    public static void prepararTests(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar("Barbara_Menezes", "Test");
        loginPage.esperarElementoVisivel(loginPage.loginSuccess);
        roadmapPage = new RoadmapPO(driver);
    }
    
    @Test 
    public void TC001_deveEstarNoMenuChangeLog(){

        roadmapPage.clicarBotaoMenuRoadmap();

        String resultado = "No Roadmap information available";

        assertEquals(roadmapPage.obterTitulo(), resultado);
    }
    
}
