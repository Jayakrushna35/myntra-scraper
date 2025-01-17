# Myntra Van Heusen T-Shirt Scraper

This project automates the process of scraping discounted Van Heusen T-shirts from Myntra using **Playwright** and **Cucumber BDD**. It extracts key details like price, discount, and product link, sorts them by the highest discount, and displays the results in the console.

---

## Project Overview

This tool leverages Playwright for browser automation and Cucumber for Behavior-Driven Development (BDD). The goal is to automate the process of finding the best deals on Van Heusen T-shirts by:

- Navigating to Myntra.
- Filtering the "Men's T-shirts" category by the brand "Van Heusen."
- Extracting and sorting product data by the highest discount.
- Displaying the results in the console.

---

## Features

- **Behavior-Driven Development**: Implements BDD using Cucumber and Gherkin syntax.
- **Browser Automation**: Uses Playwright to navigate and interact with Myntra's web interface.
- **Data Extraction**: Scrapes details such as product name, price, discount, and link.
- **Sorting**: Organizes the scraped data by the highest discount.
- **Maven Integration**: Manages dependencies and simplifies the build process.

---

## Technology Stack

- **Programming Language**: Java
- **Automation Tools**: Playwright
- **Testing Framework**: Cucumber BDD
- **Build Tool**: Maven
- **Version Control**: Git

---

## Project Structure

```
project-root/
├── pom.xml                # Maven configuration file
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── scraper/
│   │   │                └── TShirtScraper.java                           
│   │   │           
│   │   │            
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           ├── features/
│       │           │   └── FilterTShirts.feature
│       │           ├── steps/
│       │           │   └── ScraperSteps.java
│       │           └── runners/
│       │               └── TestRunner.java
```


## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/myntra-scraper.git
   cd myntra-scraper
   ```

2. **Install Dependencies**
   - Open the terminal in the project directory.
   - Run the following command to download Maven dependencies:
     ```bash
     mvn clean install
     ```

3. **Run the Tests**
   - Execute the test cases defined in the feature file using Maven:
     ```bash
     mvn test
     ```

4. **View the Output**
   - The console will display the sorted list of discounted T-shirts.
