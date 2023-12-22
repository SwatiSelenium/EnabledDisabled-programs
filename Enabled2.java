package Enabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// to check fname and lname is enabled or not??

public class Enabled2 
{
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		WebElement lname = driver.findElement(By.id("121"));
		boolean l = lname.isEnabled();
		System.out.println(l);
		WebElement fname = driver.findElement(By.name("fname"));
		boolean f = fname.isEnabled();
		System.out.println(f);
	}

}
