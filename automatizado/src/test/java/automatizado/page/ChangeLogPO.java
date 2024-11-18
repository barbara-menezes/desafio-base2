package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeLogPO extends BasePO{

    @FindBy(className = "lead")
    public WebElement titleHeader;

    @FindBy(xpath = "//a[@href=\"/changelog_page.php\"]")
    public WebElement buttonMenuChangeLog;

    public ChangeLogPO(WebDriver driver){
        super(driver);
    }

    public void clicarBotaoMenuReportIssue(){
        buttonMenuChangeLog.click();
    }
    
    public String obterTitulo(){
        return titleHeader.getText();
    }
}
