package testLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseLoginDemo {
    public WebDriver driver = null;
    //初始化
    public void init(){
        // 指定浏览器驱动路径
        System.setProperty("web-driver.chrome.driver", "src/chromedriver");
        // 新建对象
        driver = new ChromeDriver();
//        // 最大化窗口
//        driver.manage ().window ().maximize ();
    }
    //退出
    public void quit(){
        //关闭并退出浏览器
        //过3秒钟关闭浏览器
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    public void loopTest(){
        Object[][] datas = datas();
        for (int i = 0; i < datas.length; i++){
            test(datas[i]);
        }
    }
    public abstract void test(Object[] datas);

    public abstract Object[][] datas();

    public void start(){        //模板设计模式
        init();
        loopTest();
        quit();
    }
}
