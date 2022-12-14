package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	//Declaration
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement CreateContactLoopUpImg;
	
	//Initialization
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getCreateContactLoopUpImg() {
		return CreateContactLoopUpImg;
	}

	//Business logic
	/**
	 * This method will click on create new contact look up image
	 */
	public void clickOnCreateContactImg()
	{
		CreateContactLoopUpImg.click();
	}

	
}
