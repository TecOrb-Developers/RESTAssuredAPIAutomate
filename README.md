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
### Properties
config.properties is a simple constants properties file to store various constants like base URL, Token.


### Base API
We have used RestAssured RequestSpecBuilder as a basis for our API test framework. We have created a BaseTest class in which we have written Base API configuration methods.




