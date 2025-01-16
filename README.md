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
