package EventHandling;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
@Test
public void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	
	String parentWindow=driver.getWindowHandle();
	
	driver.findElement(By.id("tabButton")).click();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.facebook.com");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://twitter.com/");
	Set set=driver.getWindowHandles();
	
	set.remove(parentWindow);
	Iterator itr=set.iterator();
	while(itr.hasNext()) {
		String currentWindow=(String)itr.next();
		
		driver.switchTo().window(currentWindow);
		System.out.println("current window title"+driver.getTitle());
	}
	driver.switchTo().window(parentWindow);
	
}
}
