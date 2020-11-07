package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/hotels/book/Rendezvous-Hotels?adults=3&child=0&checkin=21-11-2020&checkout=22-11-2020&roomid=52&rooms%5B%5D=52&roomscount%5B52%5D=1&extrabeds%5B52%5D=0&adults=3&child=0&checkin=21-11-2020&checkout=22-11-2020&roomid=51&roomscount%5B51%5D=1&extrabeds%5B51%5D=0&adults=3&child=0&checkin=21-11-2020&checkout=22-11-2020&roomid=50&roomscount%5B50%5D=1");
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[1]/div/label")).sendKeys("XXX");
       // Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/label")).sendKeys("YYY");
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[1]/label")).sendKeys("sandy@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[2]/label")).sendKeys("sandy@gmail.com");
     
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[3]/div/label")).sendKeys("8987676544");
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[4]/div/label")).sendKeys("Salem");
  
       // driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[6]/button")).sendKeys("salem");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/div/div/input")).sendKeys("india",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cookyGotItBtnBox\"]/div/button")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[6]/button")).click();
       Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"guesttab\"]")).click();
	
	
	}
	
	
}
