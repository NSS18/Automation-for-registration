import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Registration {
 static protected WebDriver driver;

//1--->Method for Phptravels registration

 @Test
 public void userShouldAbleToRegisterOnPhptravelsWebsite() {

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sapan\\IdeaProjects\\WebAutomationRegister\\src\\test\\java\\BrowserDrivers\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("https://www.phptravels.org/register.php");
  WebDriverWait wait = new WebDriverWait(driver, 30);
  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
  driver.findElement(By.linkText("Register")).click();
  driver.findElement(By.id("inputFirstName")).sendKeys("Nidhi");
  driver.findElement(By.id("inputLastName")).sendKeys("Shah");
  driver.findElement(By.id("inputEmail")).sendKeys("shah.nidhi18@gmail.com");
  driver.findElement(By.id("inputPhone")).sendKeys("12345678");
  driver.findElement(By.id("inputCompanyName")).sendKeys("Uniq Testing");
  driver.findElement(By.id("inputAddress1")).sendKeys("xyz");
  driver.findElement(By.id("inputCity")).sendKeys("London");
  driver.findElement(By.id("stateinput")).sendKeys("United Kingdom");
  driver.findElement(By.id("inputPostcode")).sendKeys("HA1 2QZ");
  driver.findElement(By.id("customfield2")).sendKeys("123456789");
  driver.findElement(By.id("inputNewPassword1")).sendKeys("123456");
  driver.findElement(By.id("inputNewPassword2")).sendKeys("123456");
  wait.until(ExpectedConditions.elementToBeClickable(By.id("frmCheckout")));
  driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/p/input")).click();


 }


 //Method to automate PARA bank website
 @Test
 public void UserShouldAbleToRegisterOnParaBank() {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sapan\\IdeaProjects\\WebAutomationRegister\\src\\test\\java\\BrowserDrivers\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("https://parabank.parasoft.com/parabank/index.htm");
  WebDriverWait wait = new WebDriverWait(driver, 20);
  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
  driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();


  driver.findElement(By.id("customer.firstName")).sendKeys("Aarav");
  driver.findElement(By.id("customer.lastName")).sendKeys("Shah");
  driver.findElement(By.id("customer.address.street")).sendKeys("11 Francis Road");
  driver.findElement(By.id("customer.address.city")).sendKeys("London");
  driver.findElement(By.id("customer.address.state")).sendKeys("United Kingdom");
  driver.findElement(By.id("customer.address.zipCode")).sendKeys("Ha1 2qz");
  driver.findElement(By.id("customer.phoneNumber")).sendKeys("12345678");
  driver.findElement(By.id("customer.ssn")).sendKeys("ssn001");
  driver.findElement(By.id("customer.username")).sendKeys("Nidhi123");
  driver.findElement(By.id("customer.password")).sendKeys("123456789");
  driver.findElement(By.id("repeatedPassword")).sendKeys("123456789");
  driver.findElement(By.className("button")).click();

 }

 //Method to register on get response website

 @Test
 public void UserRegistrationOnGetResponce()
 {

  System.setProperty("webdriver.chrome.driver","C:\\Users\\sapan\\IdeaProjects\\WebAutomationRegister\\src\\test\\java\\BrowserDrivers\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.getresponse.com/features/marketing-automation?serv=adwords&camp=EMEA_UK_ENG_Marketing_Automation&kw=email_automation_services_free&type=b&gclid=Cj0KCQiApt_xBRDxARIsAAMUMu-hJd-5ABXDbI0GLuAE_-sxxLB3aAOL4mSR43ESHhe9LqUXIsyoC3gaAgLGEALw_wcB");
  driver.findElement(By.linkText("Sign up free")).click();
  driver.findElement(By.id("form_firstName")).sendKeys("Mr F Shah");
  driver.findElement(By.id("form_email")).sendKeys("xyz2fgh0123@yahoo.com");
  driver.findElement(By.id("form_password")).sendKeys("qAwerty12@");

  driver.findElement(By.xpath("/html/body/div[2]/div/a")).click();
  driver.findElement(By.xpath("//*[@id=\"form_submit\"]")).click();
 }

 //Method for registration http://automationpractice.com/index.php

 @Test
 public void UserShouldAbleToRegisterOnAutomationPracticeWebsite()
 {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\sapan\\IdeaProjects\\WebAutomationRegister\\src\\test\\java\\BrowserDrivers\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://automationpractice.com/index.php");
  WebDriverWait wait = new WebDriverWait(driver, 30);
     driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
     wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
     driver.findElement(By.id("email_create")).sendKeys("abc1Bro56wnd12345@gmail.com");
     driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
     wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender2")));
     driver.findElement(By.id("id_gender2")).click();
     driver.findElement(By.id("customer_firstname")).sendKeys("Luck");
     driver.findElement(By.id("customer_lastname")).sendKeys("Brown");
     driver.findElement(By.id("email")).click();
     driver.findElement(By.id("passwd")).sendKeys("Aa23@dfgg");
     driver.findElement(By.id("customer_firstname")).click();
     driver.findElement(By.id("customer_lastname")).click();
     driver.findElement(By.id("address1")).sendKeys("1 abc");
     driver.findElement(By.id("city")).sendKeys("xcv");
     driver.findElement(By.id("id_state")).click();
     driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[3]")).click();
     driver.findElement(By.id("postcode")).sendKeys("00000");
     driver.findElement(By.id("phone_mobile")).sendKeys("002345677");
     driver.findElement(By.id("alias")).click();
     driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();




  /*
  driver.findElement(By.xpath("/html/body/header/div/section/section[3]/ul/li[1]/a")).click();


  driver.findElement(By.id("FirstName")).sendKeys("Luck");
  driver.findElement(By.id("LastName")).sendKeys("Brown");

  driver.findElement(By.id("Password")).sendKeys("Luckbrown@1");
  driver.findElement(By.id("DobDate")).sendKeys("13/05/80");
  driver.findElement(By.id("PhoneNumber")).sendKeys("07912342456");
     driver.findElement(By.id("HouseNumberOrName")).sendKeys("13A, dorchester way");
     driver.findElement(By.id("Postcode")).sendKeys("ha3 9rq");
     driver.findElement(By.id("SearchPostcode")).click();
     driver.findElement(By.id("AddressListSelection")).click();



      //driver.findElement(By.xpath("//*[@id=\"directory-styles\"]/div/div/div[1]/div/fieldset/div/label[1]")).click();
     //wait.until(ExpectedConditions.elementToBeClickable(By.id("SignupButton")));
     //driver.findElement(By.xpath("//*[@id=\"SignupButton\"]")).click();
*/
 }

//5.user registration on https://vocab.elevenplusexams.co.uk/

    @Test
    public void userShouldAbleToRegisterOnElevenplusexams()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sapan\\IdeaProjects\\WebAutomationRegister\\src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vocab.elevenplusexams.co.uk/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"signup\"]/div/div/a")).click();
        driver.findElement(By.id("user_name")).sendKeys("qwerty");
        driver.findElement(By.id("user_email")).sendKeys("x5y3z01@yahoo.com");
        driver.findElement(By.id("user_password")).sendKeys("qw001w");
        driver.findElement(By.id("user_password_confirmation")).sendKeys("qw001w" +
                "");
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input")).click();

    }
}