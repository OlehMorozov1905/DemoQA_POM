package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage{
    public SidePanel(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;
    public AlertsPage selectAlerts() {
        clickWithJS(alerts, 0, 300);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;
    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJS(browserWindows, 0, 200);
        return new BrowserWindowsPage(driver);
    }
    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;
    public SelectMenuPage getSelectMenu() {
        clickWithJS(selectMenu, 0, 600);
        return new SelectMenuPage(driver);
    }
    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;
    public PracticeFormPage selectPracticeForm() {
        click(practiceForm);
        return new PracticeFormPage(driver);
    }
    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;
    public DroppablePage selectDroppable() {
        clickWithJS(droppable, 0, 600);
        return new DroppablePage(driver);
    }
    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;
    public BrokenLinksImagesPage selectBrokenLinksImages() {
        clickWithJS(brokenLinksImages, 0, 600);
        return new BrokenLinksImagesPage(driver);
    }

    @FindBy(xpath = "//span[.='Upload and Download']")
    WebElement download;
    public DownloadPage selectDownload() {
        clickWithJS(download, 0, 600);
        return new DownloadPage(driver);
    }
}
