package com.stormnet;

import com.stormnet.pagewidgets.GoogleSearch;
import com.stormnet.pagewidgets.SearchResults;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

/**
 * Simple Selenide Test with PageObjects
 */
public class GoogleTest{

    public void searchForSelenide() {
        // Arrange
        open("https://google.com/ncr");
        // Act
        new GoogleSearch().searchFor("selenide");

        // Assert
        SearchResults results = new SearchResults();
        results.found.shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
