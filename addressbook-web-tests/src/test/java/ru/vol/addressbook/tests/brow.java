package ru.vol.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class brow {
    public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}
