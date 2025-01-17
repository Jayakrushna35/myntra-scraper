Feature: Scrape T-shirts on Myntra

  Scenario: Scrape discounted Van Heusen T-shirts
    Given I navigate to "https://www.myntra.com"
    When I select "Men" -> "T-shirts"
    And I filter by brand "Van Heusen"
    Then I extract and sort the discounted T-shirts
    And I print the sorted data to the console
