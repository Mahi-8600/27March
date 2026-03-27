package sample1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Demo02 {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		WebElement dd=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s=new Select(dd);
		
		s.selectByIndex(3);
		
		File src = (( TakesScreenshot ) driver ).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\mahes\\OneDrive\\Desktop\\SS01\\test.png");
		
		FileHandler.copy(src, dest);
	
	}

}
