package Enabled;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver(); //empty browser
		driver.navigate().to("https://www.google.com/"); // another way to launch URL
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

}
