package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.page.LoginPO;
import automatizado.page.ReportIssuePO;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class ReportIssueTest extends BaseTest{

    private static LoginPO loginPage;
    private static ReportIssuePO reportIssuePage;

    @BeforeAll
    public static void prepararTests(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar("Barbara_Menezes", "Test");
        loginPage.esperarElementoVisivel(loginPage.loginSuccess);
        reportIssuePage = new ReportIssuePO(driver);
    }

    @Test 
    public void TC001_deveEstarNoMenuResportIssue(){

        reportIssuePage.clicarBotaoMenuReportIssue();

        String resultado = "Enter Issue Details";

        assertEquals(reportIssuePage.obterTitulo(), resultado);
    }

    @Test 
    public void TC002_deveCadastrarIssueApenasComCamposObrigatorios(){

        reportIssuePage.cadastrarIssue();

        String resultado = "Operation successful.";

        assertEquals(reportIssuePage.obterMensagemSucesso(), resultado);
    }
    
}
