package basepkg;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Saucebaseclass {
	public static WebDriver driver;
@BeforeTest 
public void bfrtest()
{
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
}
/*
@AfterTest
public void aftrtest() 
{
	driver.close();
} */
}
