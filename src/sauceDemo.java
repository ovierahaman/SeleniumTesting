import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sauceDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.crome.driver","H:\\Crome Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce"); // Correct Password
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Ovie");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Rahaman");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("1212");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        String actualText = element.getText();
        String expectedText = "Null";
        if (actualText.equals(expectedText)) {
            System.out.println("Text Matched!");
            System.out.println("Shopping Done!");
        } else {
            System.out.println("Text Not Matched!");
            System.out.println("Actual Text is: " + actualText);
        }
    }
}
