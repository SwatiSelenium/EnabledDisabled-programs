package Enabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EnableDisable1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		WebElement lname = driver.findElement(By.id("121"));
		boolean l = lname.isEnabled();
		System.out.println(l);
		if(l==true)
		{
			System.out.println("abc");
		}
		else
		{
			System.out.println("element is disabled");
		}
	}

}
