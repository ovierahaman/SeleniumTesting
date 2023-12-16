import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDriverEmail {
    public static void main(String[] args) {
        System.setProperty("webdriver.crome.driver","H:\\Crome Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ucam.uiu.ac.bd/Security/Login.aspx");
        driver.findElement(By.xpath("//*[@id=\"logMain_UserName\"]")).sendKeys("011201306");
        driver.findElement(By.xpath("//*[@id=\"logMain_Password\"]")).sendKeys("ovie1616"); // Correct Password
        driver.findElement(By.xpath("//*[@id=\"logMain_Button1\"]")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String expectedTitle  = "Student Home";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Passed! The actual title matches the expected title.");
            System.out.println("Login Successful");
        } else {
            System.out.println("Test Failed! The actual title does not match the expected title.");
            System.out.println("Actual Title: " + actualTitle);
        }
        driver.quit();
    }
}
