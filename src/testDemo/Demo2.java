package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args)throws Exception{
        // 指定浏览器驱动路径
        System.setProperty("web-driver.chrome.driver", "src/chromedriver");
        // 新建对象
        WebDriver driver = new ChromeDriver();
//        // 最大化窗口
//        driver.manage ().window ().maximize ();
//        // get()获取url
        driver.get("https://www.baidu.com");
        //通过id查询
//        WebElement kw = driver.findElement(By.id("kw"));
//        kw.sendKeys("盗墓笔记");
        // 通过name查询
//        WebElement wd = driver.findElement(By.name("wd"));
//        wd.sendKeys("盗墓笔记");
        // 通过classname查询
//        WebElement s_ipt = driver.findElement(By.className("s_ipt"));
//        s_ipt.sendKeys("盗墓笔记");
        // 通过name查询
        WebElement hao123 = driver.findElement(By.linkText("hao123"));
        hao123.click();
        //关闭并退出浏览器
        //过3秒钟关闭浏览器
        Thread.sleep(3000);
        driver.quit ();
    }
}