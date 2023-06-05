package testLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginDemo3 {
    public static WebDriver driver = null;
    //初始化
    public static void init(){
        // 指定浏览器驱动路径
        System.setProperty("web-driver.chrome.driver", "src/chromedriver");
        // 新建对象
        driver = new ChromeDriver();
//        // 最大化窗口
//        driver.manage ().window ().maximize ();
    }
    //退出
    public static void quit(){
        //关闭并退出浏览器
        //过3秒钟关闭浏览器
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    //以数组形式获取public static Object[][] datas(){}的内容使用
    public static void test(Object[] datas){
        String login = datas[0].toString();
        String password = datas[1].toString();
        String str = datas[2].toString();
        // get()获取url
        driver.get("http://fhl2.test.ccclubs.com/taxi-operator/#/login");
        //通过xpath查询
        //id
        driver.findElement(By.cssSelector("input[type ='text']")).sendKeys(login);
        driver.findElement(By.cssSelector("input[type ='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("button[class ='el-button el-button--primary el-button--normal loginBtn']")).click();
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[1]/div[2]/div/div/form/div[5]/div/div/div[1]/button/span")).click();
//       kw.sendKeys("盗墓笔记");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        String str = "密码错误";
        //断言判断登录后的网页地址"http://fhl2.test.ccclubs.com/taxi-operator/#/Home"
        if("正向测试".equals(str)){
            //断言判断登录后的网页地址是不是等同于
            boolean flag = driver.getCurrentUrl().equals("http://fhl2.test.ccclubs.com/taxi-operator/#/Home");
            //获取登录后地址并输出
            System.out.println(driver.getCurrentUrl());
            if(flag){
                System.out.println("测试通过");
            }else {
                System.out.println("测试不通过");
            }
        }else {
        String txt = driver.findElement(By.cssSelector(".el-message__content")).getText();
        System.out.println(txt);
        // 包含str的内容表示通过--断言判断
        if (txt.contains(str)){
            System.out.println("测试通过");
        }else {
            System.out.println("测试不通过");
        }
        }
    }
    //将需要的数据以数组形式赋值
    public static Object[][] datas(){
        Object[][] datas = new Object[2][3];
        Object[] datas0 = {"admin_WSei62", "admin654321", "密码错误"};
        Object[] datas1 = {"admin_WSei62", "admin654", "正向测试"};
        datas[0] = datas0;
        datas[1] = datas1;
        return datas;
    }
    public static void loopTest(){
        Object[][] datas = datas();
        for (int i = 0; i < datas.length; i++){
            test(datas[i]);
        }
    }
    public static void main(String[] args)throws Exception{
        init();
        //可以循环反复执行test()
//        test("admin_WSei62", "admin654321", "密码错误");
//        test("admin_WSei62", "admin654", "正向测试");
        //循环执行test
        loopTest();
        quit();
    }
}