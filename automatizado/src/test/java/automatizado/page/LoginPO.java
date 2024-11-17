package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO  extends BasePO{

    @FindBy(id = "username")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(className = "btn-success")
    public WebElement buttonLogin;

    @FindBy(className = "alert-danger")
    public WebElement divMessage;

    @FindBy(className = "navbar-brand")
    public WebElement loginSuccess;

    public LoginPO(WebDriver driver){
        super(driver);
    }
    
    public void inserirEmail(String texto){
        inputUsername.sendKeys(texto);
    } 

    public void inserirPassword(String texto){
        inputPassword.sendKeys(texto);
    }

    public void clicarBotaoLogin(){
        buttonLogin.click();
    }

    public String obterMensagem(){
        return divMessage.getText();
    }

    public String obterTitlePaginaPrincipal(){
        return driver.getTitle();
    }

    public void escrever(WebElement input, String texto) {
        input.clear();
        input.sendKeys(texto);
    }

    public void esperarElementoVisivel(WebElement elemento) {
        long startTime = System.currentTimeMillis();
        long timeout = 10000; // Timeout de 10 segundos

        while (System.currentTimeMillis() - startTime < timeout) {
            try {
                if (elemento.isDisplayed()) {
                    break; // Se o elemento estiver visível, sai do loop
                }
            } catch (Exception e) {
                // O elemento ainda não foi encontrado, continue esperando
            }
            try {
                Thread.sleep(500); // Espera meio segundo antes de tentar novamente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Se o tempo de espera exceder o limite, você pode adicionar algum comportamento de falha
        if (System.currentTimeMillis() - startTime >= timeout) {
            System.out.println("Timeout: o elemento não se tornou visível dentro de 10 segundos.");
        }
    }

    public void executarAcaoDeLogar(String email, String senha){
        escrever(inputUsername, email);
        buttonLogin.click();
        escrever(inputPassword, senha);
        buttonLogin.click();
    }

}
