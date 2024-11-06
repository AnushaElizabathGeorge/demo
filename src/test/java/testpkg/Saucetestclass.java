package testpkg;


import org.testng.annotations.Test; 


import basepkg.Saucebaseclass;
import pagepkg.Saucepageclass;
import utility.Sauceexcelutility;

public class Saucetestclass extends Saucebaseclass {
@Test
public void test() throws Exception
{
	Saucepageclass sg=new Saucepageclass(driver);
	String exl="C:\\Users\\admin\\Downloads\\Saucedemo.xlsx";
	String Sheet1="Sheet1";
	int rowCount=Sauceexcelutility.getRowCount1(exl, Sheet1);
	for(int i=1;i<=rowCount;i++)
	{
		String Username=Sauceexcelutility.getcellvalue1(exl, Sheet1, i, 0);
		System.out.println("Username-------"+Username);
		
		String Password=Sauceexcelutility.getcellvalue1(exl, Sheet1, i, 1);
		System.out.println("Password-------"+Password);
		
		sg.setValues(Username, Password);
		sg.clickLoginButton();
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
	}

		//sg.setValues1("standard_user", "secret_sauce");
		//sg.clickLoginButton1();
		//Thread.sleep(3000);

	

	
		//sg.alertHandle();
		sg.addingToCart();
		sg.clickCart();
		sg.clickCheckout();
		sg.setValues2("Anusha", "George", "689495");
		sg.clickContinue();
		sg.clickCancel();
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollUp(0,-1000)");
		sg.clickHamburger();
		sg.clickLogout();
		/*String expurl="https://www.saucedemo.com/inventory.html";
		String acturl=driver.getCurrentUrl();
		if(acturl==expurl)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		} */
	
	
}
}
