package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoffPO extends BasePO{

    @FindBy(className = "dropdown-toggle")
    public WebElement userMenu;

    @FindBy(xpath = "//a[@href=\"/logout_page.php\"]")
    public WebElement buttonLogoff;

    public LogoffPO(WebDriver driver){
        super(driver);
    }

    public void clicarBotaoUserMenu(){
        userMenu.click();
    }

    public void clicarBotaoLogOff(){
        buttonLogoff.click();
    }
    
}
