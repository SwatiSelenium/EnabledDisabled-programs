package Enabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled4 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		WebElement lname = driver.findElement(By.id("121"));
		boolean l = lname.isEnabled();
		System.out.println(l);
		WebElement fname = driver.findElement(By.name("fname"));
		boolean f = fname.isDisplayed();
		System.out.println(f);
		
		if(l && f)
		{
			System.out.println("both are true");
		}
		else
		{
			System.out.println("one condition is false");
		}
	}

}
