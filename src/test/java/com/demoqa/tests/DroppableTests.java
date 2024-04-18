package com.demoqa.tests;

import com.demoqa.pages.DroppablePage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTests extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getInteraction();
        new SidePanel(driver).selectDroppable();
    }

    @Test
    public void actionDragMeTest() {
        new DroppablePage(driver).actionDragMe();
    }
    @Test
    public void actionDragMeByTest() {
        new DroppablePage(driver).hideIframes();
        new DroppablePage(driver).actionDragMeBy();
    }
}
