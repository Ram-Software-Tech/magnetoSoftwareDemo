package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogin {
	private WebDriver driver;
	public AccountLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(text(), 'Sign In')])[1]")
    public WebElement signInLink;
	
	@FindBy(id = "email")
    public WebElement emailInputField;

    @FindBy(id = "pass")
    public WebElement passwordInputField;

    @FindBy(id = "send2")
    public WebElement signInBtn;
    
    @FindBy(xpath = " //span[contains(text(), 'Welcome, Lara John!')]")
    public WebElement loginMsg;
    
    public void clickonSignInLink() {
    	signInLink.click();
    }
    public void enterEmail(String emailInput) {
    	emailInputField.sendKeys(emailInput);
    }
    public void enterPass(String passInput) {
    	passwordInputField.sendKeys(passInput);
    }
    public void clickSignBtn() {
    	signInBtn.click();
    }
    public String verifyLoginMsg() {
    	return loginMsg.getText();
    }
}
