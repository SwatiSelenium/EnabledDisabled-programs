package Enabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled3 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		WebElement lname = driver.findElement(By.id("121"));
		boolean l = lname.isEnabled();
		System.out.println(l);
		try
		{
			lname.sendKeys("swati");// will give selenium.ElementNotInteractableException: exception
			System.out.println("Try block");
		}
		catch(ElementNotInteractableException e)
		{
			System.out.println("Handled element not interactable exception");
		}
		
	}

}
