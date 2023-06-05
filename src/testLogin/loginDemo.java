package testLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginDemo {
    public static void main(String[] args)throws Exception{
        // 指定浏览器驱动路径
        System.setProperty("web-driver.chrome.driver", "src/chromedriver");
        // 新建对象
        WebDriver driver = new ChromeDriver();
//        // 最大化窗口
//        driver.manage ().window ().maximize ();
//        // get()获取url
        driver.get("http://fhl2.test.ccclubs.com/taxi-operator/#/login");
        //通过xpath查询
        //id
        driver.findElement(By.cssSelector("input[type ='text']")).sendKeys("admin_WSei62");
        driver.findElement(By.cssSelector("input[type ='password']")).sendKeys("admin654321");
        driver.findElement(By.cssSelector("button[class ='el-button el-button--primary el-button--normal loginBtn']")).click();
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[1]/div[2]/div/div/form/div[5]/div/div/div[1]/button/span")).click();
//        kw.sendKeys("盗墓笔记");
        Thread.sleep(1000);
        String str = "密码错误";
        String txt = driver.findElement(By.cssSelector(".el-message__content")).getText();
        // 包含str的内容表示通过
        if (txt.contains(str)){
            System.out.println("测试通过");
        }else {
            System.out.println("测试不通过");
        }
        //System.out.println(txt);

        //关闭并退出浏览器
        //过3秒钟关闭浏览器
        Thread.sleep(5000);
        driver.quit();
    }
}