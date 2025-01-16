package com.example.steps;

import java.util.List; 

import com.example.scraper.TShirtScraper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScraperSteps {
    TShirtScraper scraper;

    @Given("I navigate to {string}")
    public void navigateTo(String url) {
        scraper = new TShirtScraper();
        scraper.launchBrowser();
        scraper.navigate(url);
    }

    @When("I select {string} -> {string}")
    public void selectCategory(String category, String subcategory) {
        scraper.selectCategory(category, subcategory);
    }

    @And("I filter by brand {string}")
    public void filterByBrand(String brand) {
        scraper.filterByBrand(brand);
    }

    @Then("I extract and sort the discounted T-shirts")
    public void extractAndSortDiscountedItems() {
        List<String> sortedData = scraper.scrapeAndSort();
        System.out.println(sortedData);
    }

    @And("I print the sorted data to the console")
    public void printSortedData() {
        scraper.printSortedData();
    }
}
