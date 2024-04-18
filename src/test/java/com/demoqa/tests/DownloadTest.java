package com.demoqa.tests;

import com.demoqa.pages.DownloadPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadTest extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getElements();
        new SidePanel(driver).selectDownload();
    }
    @Test
    public void downloadTest() {
        new DownloadPage(driver).hideIframes();
        new DownloadPage(driver).download();
    }
}
