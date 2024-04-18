package com.demoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenLinksImagesPage extends BasePage{
    public BrokenLinksImagesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a")
    List<WebElement> allLinks;
    public BrokenLinksImagesPage checkBrokenLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            WebElement element = allLinks.get(i);
            String url = element.getAttribute("href");
            verifyLinks(url);
        }
        return this;
    }
    @FindBy(css = "img")
    List<WebElement> allImages;
    public BrokenLinksImagesPage checkBrokenImages() {
        System.out.println("We have " + allImages);
        for (int i = 0; i < allImages.size(); i++) {
            WebElement image = allImages.get(i);
            String imageUrl = image.getAttribute("src");
            verifyLinks(imageUrl);

            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("return (typeof arguments[0].naturalWidth !== 'undefined' && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                    System.out.println("----------------------------------");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("----------------------------------");
                }
            } catch (Exception e) {
                System.out.println("Error occurred");
            }
        }
        return this;
    }
}
