package testDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args)throws Exception{
        // 指定浏览器驱动路径
        System.setProperty("web-driver.chrome.driver", "src/chromedriver");
        // 新建对象
        WebDriver driver = new ChromeDriver();
//        // 最大化窗口
//        driver.manage ().window ().maximize ();
//        // get()获取url
        driver.get("https://www.baidu.com");
//        //关闭并退出浏览器
        Thread.sleep(3000);
        driver.quit ();
    }
}
