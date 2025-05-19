/**
 * This class defines the steps for the T-Shirt scraper using Cucumber.
 * It includes methods to navigate to a URL, select a category and subcategory,
 * and filter by brand.
 */
/**
 * This class defines the steps for the T-Shirt scraper using Cucumber.
 * It includes methods to navigate to a URL, select a category and subcategory,
 * and filter by brand. This is newone
 */
package com.example.steps;

import com.example.scraper.TShirtScraper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScraperSteps {
    TShirtScraper scraper;

    /**
     * Initializes the scraper and navigates to the specified URL.
     * 
     * @param url the URL to navigate to
     */
    @Given("I navigate to {string}")
    public void navigateTo(String url) {
        scraper = new TShirtScraper();
        scraper.launchBrowser();
        scraper.navigate(url);
    }

    /**
     * Selects the specified category and subcategory.
     * 
     * @param category    the category to select
     * @param subcategory the subcategory to select
     */
    @When("I select {string} -> {string}")
    public void selectCategory(String category, String subcategory) {
        scraper.selectCategory(category, subcategory);
    }

    /**
     * Filters the results by the specified brand.
     * 
     * @param brand the brand to filter by
     */
    @And("I filter by brand {string}")
    public void filterByBrand(String brand) {
        scraper.filterByBrand(brand);
    }
}