package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    /**
     * Locators - resultText
     * Method - verifyTheResults(String expected)
     */

    @CacheLookup
    @FindBy(xpath ="//h1[@class='search-header__title']")
    WebElement resultText;

    public String verifyTheResults(String result) {
        return getTextFromElement(resultText, result);


    }
}
