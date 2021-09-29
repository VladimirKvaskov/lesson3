package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;


public class CRMTest {
    private static WebDriver driver;
    private static final String CRM_URL = "https://crm.geekbrains.space";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(CRM_URL);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);

        login();

        WebElement guidance = driver.findElement(By.xpath("//span[@class='title'and .='Проекты']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(guidance).build().perform();
        driver.findElement(By.xpath("//a//span[text()='Мои проекты']")).click();
        driver.findElement(By.xpath("//a[@title='Создать проект']")).click();
        driver.findElement(By.xpath("//input[@name ='crm_project[name]']")).sendKeys("ABCzzD");
        driver.findElement(By.xpath("//span[contains(.,'Укажите организацию')]")).click();
        driver.findElement(By.xpath("//div[.='1234']")).click();
        driver.findElement(By.xpath("//div[@class='select2-container select2']//a[@href='javascript:void(0)']")).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[.='Abram Abram']"))).click();
        /*driver.findElement(By.xpath("//div[.='Abram Abram']")).click();*/
        driver.findElement(By.xpath("//option[.='Research & Development']")).click();
        driver.findElement(By.xpath("//option[.='Марков Глеб']")).click();
        driver.findElement(By.xpath("//option[.='Дедова Маргарита']")).click();
        driver.findElement(By.xpath("//option[.='Королёва Елена']")).click();
        driver.findElement(By.xpath("//select[contains(@id,'crm_project_manager-uid')]//option[.='Амелин Владимир']"))
                .click();
        driver.findElement(By.xpath("//button[contains(.,'Сохранить и закрыть')]")).click();



        Thread.sleep(5000);
        driver.quit();


    }

    public static void login() {
        WebElement element = driver.findElement(id("prependedInput"));
        element.sendKeys("Applanatest1");
        driver.findElement(id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(xpath("//button[contains(text(),'Войти')]")).click();


    }
}
