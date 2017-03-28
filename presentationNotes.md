# mejsla-stepup-junit

---
## 1.txt
? Hur många känner till JUnit?
- Det är ett Java-ramverk för att skriva repeterbara tester.
JUnit is a simple framework to write repeatable tests. It is an instance of the xUnit architecture for unit testing frameworks.
---
- The goal is to create an up-to-date foundation for developer-side testing on the JVM
- JUnit Lambda (arbetsnamn)
- Java 8 <= 
---
- Skillnader mot JUnit 4
- Nya funktioner

Avbyt gärna för frågor, så ska jag försöka svara på dem


## 2.txt
Agenda


## 3.txt

### JUnit 5
JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

#### JUnit Platform
- Launching test frameworks
- Test Engine API (discovery and execution of tests)

#### JUnit Jupiter
- New programming model and extension model
- JUnit 5 Test Engine

#### JUnit Vintage
- Test engine for running JUnit 3 och 4 based tests

==> Bakåtkompabilitet

-----

## Annotations
*Annotations5.java vs Annotations4.java*

Writing first test:
AnnotationsTest5.java vs AnnotationsTest4.java
- JUnit 4, public test method
- @Test does not declare any attributes
- @DisplayName
- @Disabled vs @Ignored
- @Tag motsvarar @Categories in Junit4. Kan användas för att filtrera ut vilka test som ska köras
- @ExtendWith, används för customiserade utökningar. Eg. MockitoExtension (automatiskt skapa mockar), TimingExtension (räkna ut körtiden för varje test)
- @TestFactory, för dynamiska tester. Retunerar Stream, Iterrable of DynamicTest
- @Nested, för att nästla tester. Möjligheter att beskriva beroenden mellan tester. _@BeforeAll and @AfterAll do not work, because Java does not allow static members in inner classes._

---

## Assertions & Assumptions

Assertions.java


## Dependency Injection for Constructors and Methods

Injection.java

## @Nested

NestedTest.java


## @Dynamic

DynamicTests.java


---

## Not mentioned
- Extension model
- Platform Launcher API, used by klienter som byggverktyg och IDE:er.


---------------------
