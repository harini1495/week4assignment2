package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert 
{
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		System.out.println(frame1);
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame(1);
	//	WebDriver frame2 = driver.switchTo().frame("frame2");
		//System.out.println(frame2);
		//driver.findElement(By.id("Click1")).click();
		//System.out.println(findElement.getText());
		//Image syntax
	File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File image =new File("./snaps/frameing.jpg");
		FileUtils.copyFile(screenshot, image);
		
	}
	

}
