package Enabled;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver(); //empty browser
			driver.get("https://www.amazon.in/"); // page gets navigate to amazon.in
			driver.manage().window().maximize();
			WebElement can = driver.findElement(By.linkText("Canada"));
			Point location = can.getLocation();
			int x= location.getX();
			int y = location.getY();
			System.out.println(x);
			System.out.println(y);
	}

}
