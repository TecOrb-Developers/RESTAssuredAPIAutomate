# RestAssured API Testing Automation Framework
- This is repository of **REST API testing framework**.
- This framework is developed using **Rest-Assured** library for Rest API testing
- For JSON Parsing in java the library used is **json-simple**
- For Running tests we use third-party free library **TestNG**
- It can be used to automate all your **Rest API** test cases
- Reporting is by **Allure API**
## Requirements
- Java 1.8
- Install Eclipse / Any other latest IDE
- Install maven
## Installation
- Clone the repo on your local system
``` 
 git clone https://github.com/TecOrb-Developers/RESTAssuredAPIAutomate.git
```
- Resolve all maven dependencies

## Framework Details
### Framework
Frameworks are an essential part of any successful automated testing process. They can reduce maintenance costs and testing efforts. One can use that and build their code on top of it to solve the software requirements specific to them. Such base code is called a framework.
### Built With
- Java
- Maven
- TestNG.
- RestAssured (Java Library)
- Fillo (Read excel file Library)
- Allure report API

### Project structure
This project uses a standard Maven Java project with standard java folder structure and POM.xml

### Base API
We have used RestAssured RequestSpecBuilder as a basis for our API test framework. We have created a BaseTest class in which we have written Base API configuration methods.

### Properties
`config/config.properties` is a simple constants properties file to store various constants like base URL, Token.

### Resource
`resourceFile.TestDataSheet.xlsx` is a simple excel file to store Test Data like userId, password, request body, response 

## Packages
### Main Package
`src/main/java/` is the core package of framework. It has all our source classes with respective different sub packages for various API testing functionalities. These sub Packages are:-
- Endpoints - This package contains a constant class for all API endpoints.
- Listeners - This package contains Allure listeners and it's implementations.
- Payloads - This package holds requestPayload class which is used to pass payload in API request.
- Pojos - This package holds pojo class which is used to create API request.
- Utilities - This package have multiple classes which contains utils functions related to test classes.
### Test Package
`src/test/java/` is the main test package which contains all the TestClasses, ActionClasses and TestSchema
- Actions - This package contains API action class(Get data path from json response) and Assert action class(To verify response with output)
- Tests - It has 2 classes BaseTest and Test. BaseTest class contains all the wrapper methods over RestAssured for creating API request And Test class contains all the test classes which uses testNG as test framework.

## Acknowledgments
- [RestAssured Official Docs](https://rest-assured.io/)
- [TestNG Docs](https://testng.org/doc/)







