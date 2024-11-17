package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.page.LoginPO;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class LoginTest extends BaseTest{

    private static LoginPO loginPage;

    @BeforeAll
    public static void prepararTests(){
        loginPage = new LoginPO(driver);

    }

    @Test 
    public void TC001_naoDeveRealizarLoginComUsuarioVazio(){

        loginPage.inserirEmail("");
        loginPage.clicarBotaoLogin();

        String resultado = loginPage.obterMensagem();
        String resultadoObtido = "Your account may be disabled or blocked or the username/password you entered is incorrect.";
        
        assertEquals(resultado, resultadoObtido);
    }

    @Test 
    public void TC002_naoDeveRealizarLoginComUsuarioIncorretoESenhaVazia(){

        loginPage.executarAcaoDeLogar("User_Test", "");

        String resultado = loginPage.obterMensagem();
        String resultadoObtido = "Your account may be disabled or blocked or the username/password you entered is incorrect.";
        
        assertEquals(resultado, resultadoObtido);
    }

    @Test 
    public void TC003_naoDeveRealizarLoginComUsuarioIncorretoESenhaIncorreta(){

        loginPage.executarAcaoDeLogar("User_Test", "test");

        String resultado = loginPage.obterMensagem();
        String resultadoObtido = "Your account may be disabled or blocked or the username/password you entered is incorrect.";
        
        assertEquals(resultado, resultadoObtido);
    }

    @Test 
    public void TC004_naoDeveRealizarLoginComUsuarioCorretoESenhaIncorreta(){

        loginPage.executarAcaoDeLogar("Barbara_Menezes", "test");
        loginPage.esperarElementoVisivel(loginPage.loginSuccess);
        
        String resultado = loginPage.obterMensagem();
        String resultadoObtido = "Your account may be disabled or blocked or the username/password you entered is incorrect.";
        
        assertEquals(resultado, resultadoObtido);
    }

    @Test 
    public void TC005_deveRealizarLoginComUsuarioCorretoESenhaCorreta(){

        loginPage.executarAcaoDeLogar("Barbara_Menezes", "Test");
        loginPage.esperarElementoVisivel(loginPage.loginSuccess);
        
        String resultado = loginPage.obterTitlePaginaPrincipal();
        String resultadoObtido = "My View - MantisBT";
        
        assertEquals(resultado, resultadoObtido);
    }
}
