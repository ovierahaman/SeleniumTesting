import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.crome.driver","H:\\Crome Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.daraz.com/");

//        // Find the search box element by name
//        WebElement searchBox = driver.findElement(By.name("_nkw"));
        WebElement searchBox = driver.findElement(By.id("_nkw"));

        // Enter the search keyword (e.g., "laptop")
        searchBox.sendKeys("Asus laptop");

        // Find the search button and click it
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();
        driver.quit();
    }
}