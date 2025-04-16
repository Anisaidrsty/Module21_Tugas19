# Module21_Tugas19
# 🧪 Web UI Automation Framework with Cucumber, Java, Gradle, and Selenium
---

## 📁 Project Structure

---

## 🚀 Key Features

- ✅ **Cucumber** for Gherkin-style BDD scenarios
- ✅ **Selenium WebDriver** for web UI automation
- ✅ **Gradle** as the build tool
- ✅ **Java** as the core programming language
- ✅ **Page Object Model (POM)** for separation of concerns and clean code
- ✅ Easily extendable for more features and test cases
- ✅ Sample test case provided for demonstration

---

## 📦 Dependencies

Make sure you have Java 11+ and Gradle installed.

Key dependencies (in `build.gradle`):
```groovy
dependencies {
    // https://mvnrepository.com/artifact/io.cucumber/cucumber-java
    implementation 'io.cucumber:cucumber-java:7.22.0'

    // https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
    testImplementation 'io.cucumber:cucumber-junit:7.22.0'

    // https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation 'io.github.bonigarcia:webdrivermanager:6.0.1'

    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation 'org.seleniumhq.selenium:selenium-java:4.31.0'
}


##  Setup Instructions
1. Clone the repository
git clone https://github.com/your-username/web-ui-test-framework.git
cd web-ui-test-framework
2. Run the tests
./gradlew test
3. View the test reports After execution, reports are available in:
build/reports/tests/test/index.html



