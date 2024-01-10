package base;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class BasePage extends PageObject {

//    Common Functionalities
//    reuseable methods: find element(s), click, type, checkbox, doing mouse movements,...

    /**
     * This method is a generic method to find element: accept all kind of locators - xpath, id, ...
     * @author:
     * @param locator: "xpath=//input", "id=input"
     * @return WebElementFacade
     */
    public WebElementFacade getElement(String locator) {
        try {
            return find(getBy(locator));
        } catch (NoSuchElementException e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * This method classifies and find out which type of input locator is
     * @param locator "xpath=//input", "id=input"
     * @return By: data of the locator input
     */
    private By getBy(String locator) {

        By by = null;
        try {
            if(locator.startsWith("id=")) {
                locator = locator.substring(3);
                by = By.id(locator);

            } else if(locator.startsWith("xpath=")) {
                locator = locator.substring(6);
                by = By.xpath(locator);

            } else if(locator.startsWith("css=")) {
                locator = locator.substring(4);
                by = By.cssSelector(locator);

            } else if(locator.startsWith("name=")) {
                locator = locator.substring(5);
                by = By.className(locator);

            } else if(locator.startsWith("link=")) {
                locator = locator.substring(5);
                by = By.linkText(locator);

            }
            return by;

        } catch (Throwable t) {
            t.getMessage();
        }

        return null;
    }

    public void click (String locator) {
        waitFor(getElement(locator));
        getElement(locator).click();

    }

    public void type (String locator, String text) {
        waitFor(getElement(locator)).sendKeys(text);

    }

    public String getText (String locator) {
        return waitFor(getElement(locator)).getText();

    }

    public void moveMouseTo(String locator) {
        WebElement elementDestination = waitFor(getElement(locator));
        withAction().moveToElement(elementDestination).perform();
    }

//    Common Business Specific Functionalities



}












