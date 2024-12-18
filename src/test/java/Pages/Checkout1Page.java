package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class Checkout1Page extends BasePage {
    public Checkout1Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[id='first-name']")
    public WebElement firstNameTxt;
    @FindBy(css="[id='last-name']")
    public WebElement lastNametxt;
    @FindBy(css="[id='postal-code']")
    public WebElement postalCodetxt;
    @FindBy(css="[id='continue']")
    public WebElement continueBtn;

    public Checkout2Page continueCheck2(String firstName, String lastName, String postalCode) {
        firstNameTxt.sendKeys(firstName);
        lastNametxt.sendKeys(lastName);
        postalCodetxt.sendKeys(postalCode);
        continueBtn.click();
        return new Checkout2Page(super.getDriver());
    }

}
