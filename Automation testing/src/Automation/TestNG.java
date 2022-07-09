package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG  {
    WebDriver driver;
   
    @BeforeClass 
    public void SetUp() {
    	System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64 (2)\\msedgedriver.exe");
     
    }

      @Test 
      public void Test() throws Exception  {
    	  
          BuyProduct A = new BuyProduct();
          A.Login();
        
          EcomSignUp B = new EcomSignUp();
          B.Registration();
         
          ProductSearch C = new ProductSearch ();
          C.ProSearch();
        	 
          }
      }




