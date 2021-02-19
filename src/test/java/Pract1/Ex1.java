package Pract1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MERLIN\\eclipse-workspace\\Practice\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/test/login.html";	
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("passwd"));	//

		email.sendKeys("abcd@gmail.com");					
		password.sendKeys("abcdefghlkjl");					
		System.out.println("Text Field Set");	
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		driver.get(baseUrl);					
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
		driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
		driver.findElement(By.id("SubmitLogin")).submit();					
		System.out.println("Login Done with Submit");	
		Thread.sleep(5000);
		
	}


}
