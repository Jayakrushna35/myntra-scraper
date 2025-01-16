package com.example.scraper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TShirtScraper {
    private Browser browser;
    private Page page;

    public void launchBrowser() {
        Playwright playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    public void navigate(String url) {
        page.navigate(url);
    }

    public void selectCategory(String category, String subcategory) {
        page.click("text=" + category);
        page.click("text=" + subcategory);
    }

    public void filterByBrand(String brand) {
        page.click("//label[contains(text(),'" + brand + "')]");
    }

    public List<String> scrapeAndSort() {
        List<String> results = new ArrayList<>();
        page.locator(".product-base").allInnerTexts().forEach(results::add);
        results.sort(Comparator.reverseOrder());
        return results;
    }

    public void printSortedData() {
        scrapeAndSort().forEach(System.out::println);
    }

    public void closeBrowser() {
        browser.close();
    }
}
