package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
    public static void main(String[] args)throws Exception{
        // 指定浏览器驱动路径
        System.setProperty("web-driver.chrome.driver", "src/chromedriver");
        // 新建对象
        WebDriver driver = new ChromeDriver();
//        // 最大化窗口
//        driver.manage ().window ().maximize ();
//        // get()获取url
        driver.get("https://www.baidu.com");
        //通过xpath查询
        //id
        WebElement kw = driver.findElement(By.xpath("//*[@id='kw']"));
        kw.sendKeys("盗墓笔记");
        //关闭并退出浏览器
        //过3秒钟关闭浏览器
        Thread.sleep(3000);
        driver.quit ();
    }
}