import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLeaveApproval {
    public static void main(String[] args) {
        System.setProperty("webdriver.crome.driver","H:\\Crome Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://abcd21.odoo.com/web/login");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("ovieadmin@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin123"); // Correct Password
        driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div/div/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"top_menu\"]/ul[2]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"top_menu\"]/ul[2]/li[1]/a")).click();



    }
}
