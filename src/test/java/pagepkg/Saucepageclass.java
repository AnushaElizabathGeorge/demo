package pagepkg;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucepageclass {
WebDriver driver;
@FindBy(xpath="//*[@id=\"user-name\"]")
WebElement Suaceusername;
@FindBy(xpath="//*[@id=\"password\"]")
WebElement Saucepassword;
@FindBy(xpath="//*[@id=\"login-button\"]")
WebElement Sauceloginclick;

@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
WebElement Saucebackpack;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
WebElement Saucebikelight;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
WebElement Saucebolttshirt;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
WebElement Saucefleecejacket;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
WebElement Sauceonesie;
@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
WebElement Saucetshirtred;

@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement Sauceclickcart;

@FindBy(xpath="//*[@id=\"checkout\"]")
WebElement Sauceclickcheckout;

@FindBy(xpath="//*[@id=\"first-name\"]")
WebElement Saucefirstname;

@FindBy(xpath="//*[@id=\"last-name\"]  ")
WebElement Saucelastname;

@FindBy(xpath="//*[@id=\"postal-code\"]")
WebElement Saucezipcode;

@FindBy(xpath="//*[@id=\"continue\"]")
WebElement Saucecontinue;
@FindBy(xpath="//*[@id=\"cancel\"]")
WebElement Saucecancel;
@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
WebElement Saucehamburger;
@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
WebElement Saucelogout;

public Saucepageclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void setValues(String Username,String Password)
{
	Suaceusername.sendKeys(Username);
	Saucepassword.sendKeys(Password);
	
	
}
public void clickLoginButton()
{
	Sauceloginclick.click();
}
/*public void setValues1(String un,String pwd)
{
	Suaceusername.sendKeys(un);
	Saucepassword.sendKeys(pwd);
	
	
	
}
public void clickLoginButton1()
{
	Sauceloginclick.click();
} */

public void addingToCart()
{
	
	Saucebackpack.click();
	Saucebikelight.click();
	Saucebolttshirt.click();
	Saucefleecejacket.click();
	Sauceonesie.click();
	Saucetshirtred.click();
}
public void clickCart()
{
	Sauceclickcart.click();
}
public void clickCheckout()
{
	
	Sauceclickcheckout.click();
}
public void setValues2(String FirstName,String LastName,String ZipCode)
{
	Saucefirstname.sendKeys(FirstName);
	Saucelastname.sendKeys(LastName);
	Saucezipcode.sendKeys(ZipCode);
}

public void clickContinue()
{
	Saucecontinue.click();
}
public void clickCancel()
{
	
	Saucecancel.click();
}

public void clickHamburger()
{
	
	Saucehamburger.click();
}
public void clickLogout()
{
	Saucelogout.click();
}
}

