### Tasks

1. Download the code from Git, compile, and run.  It uses Maven.  Use any IDE and Git Client (we use Eclipse Mars and Atlassian SourceTree)

    To run the application: mvnw spring-boot:run ; it will start a server on http://localhost:8080

    To run tests: mvnw test

2. Employees are identified in the XML file employees.xml.  Employees can see the "Urgent" tick box on the contact form, and their contact request should be highlighted on the output.  Modify the EmployeeService to correctly return whether the user is an employee or not, it currently only detects "10.0.0.1".

3. There is a security flaw in the system.  "Hacker" submitted HTML in their contact request, and when the administrator views this (http://localhost:8080/view?id=3) the HTML is rendered and the script run.  Modify the code to prevent all XSS.

4. Create a new page to list the contact requests; highlight any that are from an employee.  Clicking on the request should take you to the request details.

5. It's possible for a non-employee to submit an Urgent Request by appending &urgent=true&employee=true to the query string.  Modify the solution to prohibit this.

6. The design of the code is poor.  Refactor the solution.  (consider task 7 when refactoring).

7. Complete test case "testController" to test the controller runs and returns the correct view.  The dummy database must be unaffected by this test, i.e. as in the assert, the next ID should remain unaffected even though the controller is tested successfully.

8. Submit the code to a Git branch and create a pull request.

### Test Cases

There are a number of test cases that must pass.  They may need modifying due to re-factoring the code.

In addition, feel free to add additional tests.
