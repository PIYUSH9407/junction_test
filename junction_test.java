package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junction_test {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.edgedriver().setup();
	       WebDriver driver = new EdgeDriver();
	       driver.get("https://junction.webnerserver.com/connections/add-new-connection/");
	       String title=  driver.getTitle();
	       System.out.println(title);
	       String url=driver.getCurrentUrl();
	       System.out.println(url);
	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id='id_login']")).sendKeys("piyush.rana@webners.com");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Ram7049@");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(2000);
	     /*  driver.findElement(By.xpath("//a[@id='connections']")).click();
	       //add new connections
	      driver.findElement(By.xpath("//i[contains(@class,'fas fa-user-friends')]")).click();
	      Thread.sleep(2000);
	      //search name
	      driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Rohit");
	      //click on name
	      Thread.sleep(2000);
	      Thread.sleep(2000);
	      //click on rohit
	      driver.findElement(By.xpath("//a[@class='font-weight-bold']")).click();
	      
	      //esteblised connection
	     driver.findElement(By.xpath("//*[@id=\"AAKPABPSD \"]")).click();*/
	     driver.get("https://junction.webnerserver.com/connection-profile?id=AAKPABPSD");
	     Thread.sleep(2000);
	     //add conection
	     driver.findElement(By.xpath("//*[@id=\"AAKPABPSD \"]")).click();
	     Thread.sleep(5000);
	     //withdraw
	     driver.findElement(By.xpath("//button[@id='AAKPABPSD']")).click();
	     // driver.navigate().back();
	     /*  String title1=driver.getTitle();
	       System.out.println(title1);*/
	       Thread.sleep(8000);
	       driver.close();
	     //*[@id="AAKPABPSD"]
	      
	     //i[@title='Add Connection']
	       
	       
	       
	       
		
	
	
	
	
	
	}

}
