package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewIssuePO extends BasePO{

    @FindBy(css = ".widget-title.lighter:nth-of-type(1)")
    public WebElement titleHeader;

    @FindBy(xpath = "//a[@href=\"/view_all_bug_page.php\"]")
    public WebElement buttonMenuViewIssue;

    public ViewIssuePO(WebDriver driver){
        super(driver);
    }

    public void clicarBotaoMenuViewIssue(){
        buttonMenuViewIssue.click();
    }
    
    public String obterTitulo(){
        return titleHeader.getText();
    }
    
}
