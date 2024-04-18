package com.demoqa.tests;

import com.demoqa.pages.BrokenLinksImagesPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksImagesTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getElements();
        new SidePanel(driver).selectBrokenLinksImages();
    }
    @Test
    public void checkBrokenLinks() {
        new BrokenLinksImagesPage(driver).checkBrokenLinks();
    }
    @Test
    public void checkBrokenImages() {
        new BrokenLinksImagesPage(driver).checkBrokenImages();
    }
}
