package Enabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("1"));
		boolean l1 = username.isDisplayed();
		System.out.println(l1);
		boolean l = username.isEnabled();
		System.out.println(l);
	}

}
