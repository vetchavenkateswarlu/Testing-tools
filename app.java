package browser.wb;
	  import org.openqa.selenium.*;
	  import org.openqa.selenium.chrome.ChromeDriver;

	  public class App {
	   public static void main(String[] args) throws InterruptedException {
	    //System.setProperty("webdriver.chrome.driver", "chromedriver-win64/.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.makemytrip.com/");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://www.facebook.com/");
	    //.sendKeys - is to input the text in "username/password fields"
	    driver.findElement(By.id("email")).sendKeys("vetchavenkatesh2@gmail.com");
	    Thread.sleep(6000);
	    driver.findElement(By.name("pass")).sendKeys("nit@369");
	    Thread.sleep(8000);
	    //.Click - is to perform action on "BUTTONS"
	    /*driver.findElement(By.name("login")).click();
	       Thread.sleep(10000);*/
	       driver.get("https://www.amazon.in/");
	       Thread.sleep(20000);
	       driver.get("https://www.ibooma bagavatha kaseri telugu movie .in/");
	       Thread.sleep(50000);
	       driver.findElement(By.id("createAccountSubmit")).click();
	       Thread.sleep(6000);
	        driver.findElement(By.xpath(" WebElement YourName = driver.findElement(null)")).sendKeys("venky");
	       //Thread.sleep(7000);
	       //fn.sendKeys("venky");
	      // Thread.sleep(8000);
	       
	       //fn.clear();
	       //Thread.sleep(9000);
	       //fn.sendKeys("nit");
	       //Thread.sleep(10000);
	       driver.findElement(By.id("ap_phone_number")).sendKeys("9441294542");
	       Thread.sleep(110000);
	       driver.findElement(By.name("password")).sendKeys("venky@1234");
	       Thread.sleep(80000);
	       driver.findElement(By.className("a-button-input")).click();
	    //driver.manage().window().minimize();
	    Thread.sleep(6000);
	    driver.close();
	    driver.getCurrentUrl();
	  	
	    
	   }

	  } 

