package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	private WebDriver driver;
	public CreateAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//a[contains(text(), 'Create an Account')]")
    public WebElement CreateAccountBtn;
    
    @FindBy (xpath = "//input[@id='firstname']")
    public WebElement firstNameInputField;

    @FindBy (xpath = "//input[@id='lastname']")
    public WebElement lastNameInputField;

    @FindBy (xpath = "//input[@id='email_address']")
    public WebElement emailAddressInputField;


    @FindBy (xpath = "//input[@id='password']")
    public WebElement  passwordInputField;


    @FindBy (xpath = "//input[@id='password-confirmation']")
    public WebElement  passwordConfirmationInputField;


    @FindBy (xpath = "//button[@class='action submit primary']")
    public WebElement  createAnAccountBtn;
    
    @FindBy (xpath = "//div[contains(text(),'Thank you for registering')]")
    public WebElement  accountCreateMsg;
    
    
    public void clickAccLink() {
    	CreateAccountBtn.click();
    }
    public void setFirstName(String firstName) {
    	firstNameInputField.sendKeys(firstName);
    }
    public void setastName(String lastName) {
    	lastNameInputField.sendKeys(lastName);
    }
    public void setEmail(String email) {
    	emailAddressInputField.sendKeys(email);
    }
    public void setPassword(String password) {
    	passwordInputField.sendKeys(password);
    }
    public void setConfirmPass(String confirmPass) {
    	passwordConfirmationInputField.sendKeys(confirmPass);
    }
    public void clickAnAccBtn() {
    	createAnAccountBtn.click();
    }
    public String verifyTitle() {
    	String acoountRegistredMsg=accountCreateMsg.getText();
    			return acoountRegistredMsg;
    }
    	
}
