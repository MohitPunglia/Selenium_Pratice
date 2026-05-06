package com.example;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get("https://demoqa.com/alerts");

        // -------------Below code is for Checkbox----------
        // driver.get("https://demoqa.com/checkbox");
        // WebElement checkBox = driver.findElement(By.className("rc-tree-checkbox"));

        // if (checkBox.isSelected()) {
        // String text = driver.findElement(By.xpath("//*[contains(text(),'You have
        // selected :')]")).getText();
        // System.err.println("*************" + text);
        // } else {
        // checkBox.click();
        // System.err.println("This was clicked");
        // }

        // driver.quit();
        // // div[@id='result']/[]

        // -------------Below code is for TextBox----------
        // driver.get("https://demoqa.com/text-box");
        // WebElement name = driver.findElement(By.id("userName"));
        // WebElement email = driver.findElement(By.id("userEmail"));
        // WebElement address = driver.findElement(By.id("currentAddress"));
        // WebElement permanentadd = driver.findElement(By.id("permanentAddress"));
        // WebElement submitbtn = driver.findElement(By.id("submit"));

        // name.sendKeys("Tom Little");
        // email.sendKeys("tomlittle@gmail.com");
        // address.sendKeys("This is current address which is inserted by Selenium
        // Scripts");
        // permanentadd.sendKeys("This is permanent address inserted by Selenium
        // Scripts");
        // submitbtn.click();

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#output
        // p")));

        // List<WebElement> ptag = driver.findElements(By.cssSelector("#output p"));

        // for (WebElement element : ptag) {
        // System.out.println(element.getText());
        // }
        // System.err.println("End of script reached");

        // -------------Below code is for WebTable----------
        // driver.get("https://demoqa.com/webtables");

        // Scenario 1: Print Entire Table
        // List<WebElement> table = driver.findElements(By.xpath("//table//tbody//tr"));

        // for (WebElement webtable : table) {
        // System.out.println(webtable.getText());
        // }

        // Scenario 2: Find Person with Age > 30

        // for (WebElement element : table) {
        // String name = element.findElement(By.xpath("td[1]")).getText();
        // int age = Integer.parseInt(element.findElement(By.xpath("td[3]")).getText());

        // if (age > 30) {
        // System.out.println(name + " : " + age);
        // }
        // }

        // -------------Below code is for Buttons----------
        // https://demoqa.com/buttons

        // Actions action = new Actions(driver);

        // action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();

        // String message = driver.findElement(By.id("doubleClickMessage")).getText();

        // System.err.println(message);

        // action.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();

        // String clickMessage =
        // driver.findElement(By.id("rightClickMessage")).getText();

        // System.err.println(clickMessage);

        // -------------Below code is for Auto complete----------
        // https://demoqa.com/auto-complete

        // driver.findElement(By.id("autoCompleteMultipleInput")).sendKeys("g");

        // List<WebElement> options = wait.until(ExpectedConditions
        // .visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'auto-complete__option')]")));

        // if (options.size() == 3) {
        // System.out.println("PASS: 3 suggestions displayed");
        // } else {
        // System.out.println("FAIL: Expected 3 but found " + options.size());
        // }

        // for (WebElement option : options) {
        // String text = option.getText();
        // System.err.println(text);
        // }

        // https://demoqa.com/sortable

        // WebElement source =
        // driver.findElement(By.xpath("//div[@data-handler-id='T0']"));
        // WebElement target =
        // driver.findElement(By.xpath("//div[@data-handler-id='T8']"));

        // Actions action = new Actions(driver);

        // action.clickAndHold(source).moveToElement(target).pause(Duration.ofSeconds(2)).release().build().perform();

        // action.moveToElement(driver.findElement(By.xpath("//div[@data-handler-id='T0']")));

        // https://demoqa.com/browser-windows

        // String parentWindow = driver.getWindowHandle();
        // driver.findElement(By.id("tabButton")).click();
        // Set<String> childWindow = driver.getWindowHandles();

        // for (String window : childWindow) {
        // if (!window.equals(parentWindow)) {
        // driver.switchTo().window(window);
        // break;
        // }
        // }
        // System.out.println("Title of Window is ---->" + driver.getTitle());
        // driver.close();
        // driver.switchTo().window(parentWindow);

        // https://demoqa.com/modal-dialogs

        // driver.findElement(By.id("showSmallModal")).click();
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        // String text = driver.findElement(By.className("modal-body")).getText();
        // System.out.println(text);
        // driver.findElement(By.id("closeSmallModal")).click();
        // System.out.println("************** Running 2nd Test ************");
        // driver.findElement(By.id("showLargeModal")).click();
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        // String largeText =
        // driver.findElement(By.xpath("//*[@class='modal-body']/p")).getText();
        // System.out.println(largeText);
        // driver.findElement(By.id("closeLargeModal")).click();

        // https://demoqa.com/alerts

        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.id("timerAlertButton")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Text is " + alert.getText());
        alert.accept();

        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().accept();
        String acceptText = driver.findElement(By.id("confirmResult")).getText();
        System.out.println("Accept Text is ===> " + acceptText);
        Assert.assertEquals(acceptText, "You selected Ok");

        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().dismiss();
        String dismissText = driver.findElement(By.id("confirmResult")).getText();
        System.out.println("Dismiss Text is ===> " + dismissText);
        Assert.assertEquals(dismissText, "You selected Cancel");

    }
}
