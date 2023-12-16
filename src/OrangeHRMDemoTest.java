import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMDemoTest {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable (you need to download it)
        System.setProperty("webdriver.crome.driver","H:\\Crome Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM Demo website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Example: Logging in
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

        usernameField.sendKeys("Admin");
        passwordField.sendKeys("null1011111");
        loginButton.click();

        // Add more test steps as needed

        // Close the browser
        driver.quit();
    }
}
