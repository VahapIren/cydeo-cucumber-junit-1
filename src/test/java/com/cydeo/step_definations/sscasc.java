package com.cydeo.step_definations;

import com.cydeo.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sscasc {
    @Test
    public void test(){
        Driver.getDriver().get("https://demo.opencart.com/admin/index.php");

        WebElement username= Driver.getDriver().findElement(By.id("input-username"));
        WebElement password= Driver.getDriver().findElement(By.id("input-password"));
        WebElement loginBtn= Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));

        username.clear();
        username.sendKeys("demo");
        password.clear();
        password.sendKeys("demo");
        loginBtn.click();

        WebElement close= Driver.getDriver().findElement(By.xpath("//button[@class='btn-close']"));
        close.click();

    }
}
