package lists;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectOpt {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Gaurav/Desktop/HTML/multiplelist.html");
		
		WebElement lstbox = driver.findElement(By.id("country"));
		
		Select sel=new Select(lstbox);
		System.out.println(sel.isMultiple());
		
		WebElement allopt = sel.getWrappedElement();
		System.out.println(allopt.getText());
		
		sel.selectByIndex(0);
		sel.selectByValue("b");
		sel.selectByVisibleText("Canada");
		Thread.sleep(2000);
		sel.deselectByIndex(1);
		sel.deselectByValue("a");
		sel.deselectByVisibleText("Canada");
		Thread.sleep(2000);
		sel.selectByIndex(0);
		sel.selectByValue("b");
		sel.selectByVisibleText("UK");
		Thread.sleep(2000);
		sel.deselectAll();
		
		

		
		
	}
}
