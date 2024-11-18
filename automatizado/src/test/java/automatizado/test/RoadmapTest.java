package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.page.LoginPO;
import automatizado.page.RoadmapPO;
import io.github.cdimascio.dotenv.Dotenv;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class RoadmapTest extends BaseTest{

    private static LoginPO loginPage;
    private static RoadmapPO roadmapPage;

    @BeforeAll
    public static void prepararTests(){
        Dotenv dotenv = Dotenv.configure()
                              .directory("../.env")
                              .load();
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar(dotenv.get("USER_NAME"), dotenv.get("PASSWORD"));
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
