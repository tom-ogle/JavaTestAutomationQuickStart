# JavaTestAutomationQuickStart
A quickstart project I created to allow a friend to quickly bootstrap his test automation project using Java, Selenium WebDriver, TestNG and Maven.

There are several improvements that should be made if using this in a real-world project.  

To run the example tests: `mvn integration-test`

Tests are located based on their classname ending in "Test".

To run a single test: `mvn -Dtest=W3Test integration-test`

There are two example tests, W3Test and UsingPageObjectsW3Test, each using a different way of organising the test automation.

W3Test uses a Library class for containing reusable functions. UsingPageObjectsW3Test is an alternative that shows one way of using PageObjects to represent an abstraction of pages. Different people have different preferences regarding how to organise page objects but this approach avoids making assertions inside the PageObjects themselves.
It takes longer up front to write your test automation using Page Objects but it makes repetitive tests much easier to write and makes the tests more maintainable by limiting changes to a single place and giving a structure for organising things.
