package com.cydeo.exceltestsApachePOI;

import com.cydeo.pages.VyTrackDashboardPage;
import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VyTrackDDTTest {
    VytrackLoginPage loginPage=new VytrackLoginPage();
    VyTrackDashboardPage dashboardPage=new VyTrackDashboardPage();

    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @Test
    public void loginDDTTest() throws IOException {

        String file="SampleData.xlsx";
        FileInputStream in = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheet("trackdata");

        for (int i = 1; i <=sheet.getLastRowNum() ; i++) {
            String userName=sheet.getRow(i).getCell(0).toString();
            String password=sheet.getRow(i).getCell(1).toString();
            String fullName=sheet.getRow(i).getCell(2).toString();
            loginPage.login(userName,password);

            WebDriverWait wait=new WebDriverWait(Driver.getDriver(),30);
            WebElement loaderMask=Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
            XSSFCell resultCell=sheet.getRow(i).getCell(3);

            if(dashboardPage.fullName.getText().equals(fullName)){
                System.out.println("PASS");
                resultCell.setCellValue("PASSed");
            }else{
                System.out.println("FAIL");
                resultCell.setCellValue("FAILed");
            }

            dashboardPage.logout();
        }

        FileOutputStream out=new FileOutputStream(file);
        workbook.write(out);

        in.close();
        out.close();
        workbook.close();

    }
    @After
    public void teardown(){
        Driver.closeDriver();
    }


}
