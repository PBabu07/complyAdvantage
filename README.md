Project Title:

Comply Advantage

Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites:

Java

Maven

Any IDE

Running the tests

1. Open the project in Eclipse/IntelliJ IDE
2. Run "mvn install" command
3. Once all the maven dependencies are added to the project,
4. Go to TestRunner.java file
5. Right click -> Run as -> JUnit
6. 3 tests in the feature file should run.
Authors

Prasad Babu

Bugs found:

1. The form gets submitted inspite of empty data

2. There's no  validation on Full Name, Country, year of birth and Position

3. The form gets submitted even if the year of birth is under 18 years!

4. The pop message always shows the name "John Doe" regardless of what we enter. 
