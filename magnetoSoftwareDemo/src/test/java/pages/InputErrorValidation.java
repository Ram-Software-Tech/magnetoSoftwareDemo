package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputErrorValidation {
	private WebDriver driver;
	public InputErrorValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy (id = "firstname-error" )
    public WebElement firstNameInputErrorMsg;

    @FindBy (xpath = "//div[@id='lastname-error']" )
    public WebElement lastNameInputErrorMsg;


    @FindBy (id = "email_address-error" )
    public WebElement emailInputErrorMsg;
    
     public String validateFirstNameInputError() {
    	return firstNameInputErrorMsg.getText();
     }
     public String validateLastNameInputError() {
    	 return lastNameInputErrorMsg.getText();
     }
     public String validateEmailInputError() {
    	 return emailInputErrorMsg.getText();
     }
     
}

