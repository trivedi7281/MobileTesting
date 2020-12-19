package calcPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class calcTest {

    
    static AppiumDriver<MobileElement> driver;
    

    public static void main(String[] args) {

        try {
            openCalc();
        } catch (MalformedURLException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void openCalc() throws MalformedURLException {
       
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("DeviceName", "trivedi's");
        cap.setCapability("udid", "10.85.54.97:5555");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");

        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,cap);
        System.out.println("Application Started....");


        MobileElement nine = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
        MobileElement multiply = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        MobileElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        nine.click();
        multiply.click();
        three.click();
        MobileElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();
        MobileElement result = driver.findElement(By.className("android.widget.EditText"));
        String res = result.getText();
        System.out.println("\n Result is : "+ res);

        System.out.println("Completed....");


    }



<!--------------------------------code------------------------->
    
    
}
