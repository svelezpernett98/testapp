# testapp
This is a Maven project that uses the Page Object Model design patter to automate, in this case, two test cases defined in AppTest.java.
The first test case creates a SF account, and the second case (which depends on the successful execution of the first test case) is to verify that the previously created account can be modified.

The AppTest.java class has a:
- @BeforeSuite setUp method which initialises the WebDriver, and the necesarry class instances we'll need for the execution of the test cases.
- @AfterSuite driverCleanUp method that closes the window and the instance of the driver session.
- @BeforeTest signIn method that logs in using the provided credentials via @Parameters
- @AfterTest DeleteAccountAndsignOut method which deletes the created accounts for test case maintainability, and logs out from the SF website

After each test is executed, it takes a screenshot of the result and saves it into target > screenshots

Execute the testng.xml file as a TestNg suite
