package com.example.selenium.web;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDriverController {

    /*public static void main(String[] args) {//配置火狐浏览器
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/firefox-bin");
        String testUrl = "http://www.baidu.com";
        driver.get(testUrl);
        driver.quit();
    }*/

      /*  public static void main(String[] args) {//下载chrome的驱动
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Applications/chrome.app/Contents/MacOS/chrome");
        String testUrl = "http://www.baidu.com";
        driver.get(testUrl);
        driver.quit();
    }*/

    public static void main(String[] args) {//配置safari浏览器：safari-偏好设置-高级-在菜单栏中显示'开发'，开发-允许远程自动化
        WebDriver driver = new SafariDriver();
        String testUrl = "http://www.baidu.com";
        driver.get(testUrl);
        driver.quit();
    }
}