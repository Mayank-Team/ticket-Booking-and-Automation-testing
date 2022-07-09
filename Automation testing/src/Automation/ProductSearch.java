package Automation;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class ProductSearch {

    public void ProSearch() throws Exception{

  WebDriver driver=new EdgeDriver();
  String URL="http://automationpractice.com/index.php";
 
  driver.get(URL);
  driver.manage().window().maximize();

  // Initialise Actions class object
  Actions actions=new Actions(driver);
  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
  WebElement womenTab=driver.findElement(By.linkText("WOMEN"));
  WebElement TshirtTab=driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']"));
  actions.moveToElement(womenTab).moveToElement(TshirtTab).click().perform();
  Thread.sleep(2000);

  // Get Product Name
  String ProductName=driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
  System.out.println(ProductName);
  driver.findElement(By.id("search_query_top")).sendKeys(ProductName);
  driver.findElement(By.name("submit_search")).click();

  // Get Name of Searched Product
  String SearchResultProductname=driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
 
  // Verify that correct Product is displaying after search
  if(ProductName.equalsIgnoreCase(SearchResultProductname)) {
   System.out.println("Results Matched;Test Case Passed");
  }else{
   System.out.println("Results NotMatched;Test Case Failed");
  }

  // Close the browser
  Thread.sleep(2000);
  driver.close();
 }
}
 

