package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcAlert {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		WebElement okAlert = driver.findElement(By.xpath("//button[text()='OK']"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(okAlert).click().perform();
		
		
		//Alert alert = driver.switchTo().alert();
		
		//alert.accept();
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> winHandles = driver.getWindowHandles();
		
		List<String> listhandles = new ArrayList<String>(winHandles);
		
		String flightWindow = listhandles.get(1);
		
		driver.switchTo().window(flightWindow);
		
		String Filghts = driver.getTitle();
		
		System.out.println(Filghts);
		
		driver.close();
		
		driver.switchTo().window(listhandles.get(0));
		
		String Trains = driver.getTitle();
		
		System.out.println(Trains);
	}

}
