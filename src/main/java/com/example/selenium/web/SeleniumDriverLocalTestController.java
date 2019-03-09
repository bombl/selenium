package com.example.selenium.web;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumDriverLocalTestController {

   public static WebDriver driver;


    public static void main(String[] args) {//配置safari浏览器：safari-偏好设置-高级-在菜单栏中显示'开发'，开发-允许远程自动化
        driver = new SafariDriver();
        String testUrl = "http://www.baidu.com";
        driver.get(testUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("kw")).sendKeys("selenium");
        
        //driver.findElement(By.id("kw")).sendKeys("selenium教程");  //id='kw'
        //driver.findElement(By.name("wd")).sendKeys("test");  //name='wd'
        //driver.findElement(By.className("s_ipt")).sendKeys("webdriver"); //class='s_ipt'
        //driver.findElement(By.id("su")).click();
        //driver.findElement(By.linkText("新闻")).click();//<a>新闻</a>

        //driver.findElement(By.partialLinkText("新")).click();//<a>新闻</a>
        //driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("webdriver");
        //driver.findElement(By.cssSelector("#kw")).sendKeys("webdriver");
       /* WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> rows =  table.findElements(By.tagName("tr"));
        for (WebElement row:rows) {
              List<WebElement> tds = row.findElements(By.tagName("td"));
            for (WebElement td:tds) {
                System.out.println(td.getText());
            }

        }*/
//       driver.quit();

        //driver.findElement(By.id("su")).click();
        //driver.findElement(By.id("")).click();
    }
}