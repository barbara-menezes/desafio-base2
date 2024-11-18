package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoadmapPO extends BasePO{

    @FindBy(className = "lead")
    public WebElement titleHeader;

    @FindBy(xpath = "//a[@href=\"/roadmap_page.php\"]")
    public WebElement buttonMenuRoadmap;

    public RoadmapPO(WebDriver driver){
        super(driver);
    }

    public void clicarBotaoMenuRoadmap(){
        buttonMenuRoadmap.click();
    }
    
    public String obterTitulo(){
        return titleHeader.getText();
    }
}