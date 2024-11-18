package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyViewPO extends BasePO{

    @FindBy(xpath = "//*[@id=\"timeline\"]//h4[@class=\"widget-title lighter\"]")
    public WebElement titleHeader;

    @FindBy(xpath = "//a[@href=\"/my_view_page.php\"]")
    public WebElement buttonMenuMyView;

    public MyViewPO(WebDriver driver){
        super(driver);
    }

    public void clicarBotaoMenuMyView(){
        buttonMenuMyView.click();
    }
    
    public String obterTitulo(){
        return titleHeader.getText();
    }
    
}
