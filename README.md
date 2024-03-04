# Selenium API Testing with Rest Assured
This project demonstrates API testing using Selenium WebDriver and Java for the website [TheMealDB](https://www.themealdb.com/). TheMealDB is a free and open, crowd-sourced database of meals from around the world.

## Prerequisites
Java Development Kit (JDK) installed on your machine.
Apache Maven installed on your machine.
WebDriver executable (e.g., ChromeDriver) compatible with your browser version.
Test Overview
The Selenium API tests included in this project interact with TheMealDB's website to perform various actions such as searching for meals, retrieving meal details, and verifying the correctness of displayed information.

## Setup Instructions
### Clone or Download this Repository: 
Clone or download this repository to your local machine.

### Install Dependencies: 
Navigate to the project directory and install the dependencies using Maven:

```bash
mvn clean install
```
### Update Test Data:
If necessary, update test data and parameters in the test files to match your testing requirements.

### How to Run the Tests
Execute Tests: Run the tests using Maven:

```bash
mvn test
```

### View Test Results:
After the tests complete execution, view the test results in the console output. Any failures or errors encountered during test execution will be displayed.


### Additional Notes
Ensure a stable internet connection during test execution to interact with TheMealDB website. Customize and expand the test suite according to additional testing scenarios and requirements.