package framework.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){

    }
    private static WebDriver driver;
    public  static WebDriver getDriver(){
        if(driver==null){//kontrol et,eğer bir değer ataması yapıldıysa yeni bir driver oluşturma
            switch(ConfigReader.getProperty("browser")){//driverımızı seçtiğim driverda çalıştrımamızı sağlar.eğer driver seçmediysek defult olarak choreme gelir
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
        }
        driver=null;//getDriver method'unu tekrar çağırdığımızda yeni değer atayabilmek için null değeri atamamız gerekiyor
    }
}
