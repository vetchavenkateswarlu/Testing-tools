package web.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class venkylaunch {



	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/in/");
		Thread.sleep(4000);
		//Scroll by
		//Classname referance varaible = new classname();
		Actions actions=new Actions(driver);
		actions.scrollByAmount(0,3000).perform();
		//radio Button Click 
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("RADHA");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("KRISHNA");
		Thread.sleep(6000);
		driver.findElement(By.name("sex")).click();	
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[6]/div/div[1]/input")).sendKeys("1234567889");
		Thread.sleep(8000);
		//WebElement maleRadiobutton = driver.findElement(By.xpath("//input[@value = Male]"));
//syntax : if(condition){
		//body - SYSOUT		
	//}
	//else {
		//SYSOUT
	//}
	
	/*if (maleRadiobutton.isSelected()) {
		System.out.println("display male radio button is selected");
		
	}else
		
	{
		System.out.println("display female & custom radio buttons are unselected");
	}*/
	





	}



}
