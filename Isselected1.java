package Enabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
			searchtb.sendKeys("shoe");
			driver.findElement(By.id("nav-search-submit-button")).click();// enter xpath
			Thread.sleep(2000);
		/*	WebElement tomorrowdelivery = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")); // get it by tomorrow xpath
			tomorrowdelivery.click();
			Thread.sleep(5000); */
			WebElement tomorrowdelivery = driver.findElement(By.xpath("//li[@id='p_90/6741118031']"));
			tomorrowdelivery.click();
			Thread.sleep(5000);
		
			boolean ans = tomorrowdelivery.isSelected();
			System.out.println(ans);
	}

}
