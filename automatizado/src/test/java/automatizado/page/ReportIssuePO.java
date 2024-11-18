package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportIssuePO extends BasePO{

    @FindBy(xpath = "//a[@href = 'bug_report_page.php']")
    public WebElement buttonMenuReportIssue;

    @FindBy(id = "category_id")
    public WebElement selectCategory;

    @FindBy(xpath = "//*[@id=\"category_id\"]/option[2]")
    public WebElement selectCategoryOption2;

    @FindBy(id = "reproducibility")
    public WebElement selectReproducibility;

    @FindBy(id = "severity")
    public WebElement selectSeverity;

    @FindBy(id = "priority")
    public WebElement selectPriority;

    @FindBy(id = "summary")
    public WebElement inputSummary;

    @FindBy(id = "description")
    public WebElement inputDescription;

    @FindBy(id = "steps_to_reproduce")
    public WebElement inputReproduce;

    @FindBy(id = "additional_info")
    public WebElement inputAdditionalInfo;

    @FindBy(id = "tag_string")
    public WebElement inputTag;

    @FindBy(id = "input-sm")
    public WebElement selectInputSM;

    @FindBy(className = "btn-primary")
    public WebElement buttonSubmitIssue;

    @FindBy(xpath = "//*[@id=\"report_bug_form\"]/div/div[1]/h4")
    public WebElement titleHeader;

    public ReportIssuePO(WebDriver driver){
        super(driver);
    }

    public void clicarBotaoMenuReportIssue(){
        buttonMenuReportIssue.click();
    }

    public String obterTitulo(){
        return titleHeader.getText();
    }

    public void cadastrarCategory(){
        selectCategory.click();
        selectCategoryOption2.click();
    }

    public void inserirSummary(){
        inputSummary.click();
        inputSummary.sendKeys("New Bug");
    }

    public void inserirDescription(){
        inputDescription.click();
        inputDescription.sendKeys("The bug is related to ....");
    }

    public void submitReportIssue(){
        buttonSubmitIssue.click();
    }
    
}
