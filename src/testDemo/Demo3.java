package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.namespace.QName;

public class Demo3 {
    public static void main(String[] args)throws Exception{
        // 指定浏览器驱动路径
        System.setProperty("web-driver.chrome.driver", "src/chromedriver");
        // 新建对象
        WebDriver driver = new ChromeDriver();
//        // 最大化窗口
//        driver.manage ().window ().maximize ();
//        // get()获取url
        driver.get("https://www.baidu.com");
        //通过css 查询
        //id
//        WebElement kw = driver.findElement(By.cssSelector("#kw"));
//        kw.sendKeys("盗墓笔记");
//        WebElement kw = driver.findElement(By.cssSelector(".s_ipt"));
//        kw.sendKeys("盗墓笔记");

//        WebElement kw = driver.findElement(By.cssSelector("[name ='wd']"));
        WebElement kw = driver.findElement(By.cssSelector("input[name ='wd']"));
        kw.sendKeys("盗墓笔记");
        //关闭并退出浏览器
        //过3秒钟关闭浏览器
        Thread.sleep(3000);
        driver.quit ();
    }
}