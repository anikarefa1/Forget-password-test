import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Password {

    public static WebDriver driver;
    public static void main(String[]args){
        launch_chrome();
        openUrl();
        TestCase_001();
        TestCase_002();
        TestCase_003();
        TestCase_004();
        close_chrome();

    }

    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver", "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void openUrl() {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    public static void TestCase_001(){
        WebElement ForgottenPassword= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > div:nth-child(2) > a"));
        ForgottenPassword.click();

        WebElement EmailAddress= driver.findElement(By.cssSelector("#input-email"));
        EmailAddress.clear();
        EmailAddress.sendKeys("anika11111@gmail.com");

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div.pull-right > input"));
        ContinueBtn.click();

        String Expected_URL="https://demo.opencart.com/index.php?route=account/login";
        String Actual_URL= driver.getCurrentUrl();

        if(Expected_URL.equals(Actual_URL)){
            System.out.println("Test Case 001 Passed");
        }
        else{
            System.out.println("Test Case 001 Failed");
        }


    }
    public static void TestCase_002(){
        WebElement ForgottenPassword= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > div:nth-child(2) > a"));
        ForgottenPassword.click();

        WebElement EmailAddress= driver.findElement(By.cssSelector("#input-email"));
        EmailAddress.clear();
        EmailAddress.sendKeys("11111@gmail.com");

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div.pull-right > input"));
        ContinueBtn.click();

        String Expected_URL="https://demo.opencart.com/index.php?route=account/login";
        String Actual_URL= driver.getCurrentUrl();

        if(Expected_URL.equals(Actual_URL)){
            System.out.println("Test Case 002 Passed");
        }
        else{
            System.out.println("Test Case 002 Failed");
        }


    }

    public static void TestCase_003(){
        WebElement ForgottenPassword= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > div:nth-child(2) > a"));
        ForgottenPassword.click();

        WebElement EmailAddress= driver.findElement(By.cssSelector("#input-email"));
        EmailAddress.clear();
        EmailAddress.sendKeys("anika");

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div.pull-right > input"));
        ContinueBtn.click();

        String Expected_URL="https://demo.opencart.com/index.php?route=account/login";
        String Actual_URL= driver.getCurrentUrl();

        if(Expected_URL.equals(Actual_URL)){
            System.out.println("Test Case 003 Passed");
        }
        else{
            System.out.println("Test Case 003 Failed");
        }


    }
    public static void TestCase_004(){

        WebElement LoginBtn= driver.findElement(By.cssSelector("#column-right > div > a:nth-child(1)"));
        LoginBtn.click();

        WebElement ForgottenPassword= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > div:nth-child(2) > a"));
        ForgottenPassword.click();

        WebElement EmailAddress= driver.findElement(By.cssSelector("#input-email"));
        EmailAddress.clear();
        EmailAddress.sendKeys("   ");

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div.pull-right > input"));
        ContinueBtn.click();

        WebElement BackBtn= driver.findElement(By.cssSelector("#content > form > div > div.pull-left > a"));
        BackBtn.click();

        String Expected_URL="https://demo.opencart.com/index.php?route=account/login";
        String Actual_URL= driver.getCurrentUrl();

        if(Expected_URL.equals(Actual_URL)){
            System.out.println("Test Case 004 Passed");
        }
        else{
            System.out.println("Test Case 004 Failed");
        }


    }


    public static void close_chrome(){
        driver.close();
    }
}




