# the-automation-portfolio

**Automation portfolio:** Selenium WebDriver + JUnit tests for https://the-internet.herokuapp.com/

---

# 📁 Project Structure

the-automation-portfolio/

├── src/

│ └── test/

│ ├── java/
│ │ ├── pages/ # Page Object classes
│ │ └── tests/ # Test classes
├── pom.xml # Maven configuration
├── README.md # Project overview and instructions
└── .gitignore # Ignored files

---

## 🚀 Technologies

- **Java 17** (Eclipse Temurin)  
- **Selenium 4** (WebDriver)  
- **JUnit 5** (junit-jupiter & params)  
- **Maven** (build & dependency management)  
- **ChromeDriver** (browser automation)

---

## 📋 Test Scenarios

1. **Login Page**  
   - Positive and negative flows, parameterized tests  
2. **Checkboxes**  
   - Toggle checkboxes on and off, default state verification, parameterized tests  
3. **JavaScript Alerts**  
   - `alert()`, `confirm()`, `prompt()` interactions  
4. **(Coming soon)**  
   - Dynamic Loading  
   - Dropdown selection  
   - …and more

---

## ⚙️ Getting Started

1. **Clone the repository**  
   git clone https://github.com/KateOrlyk/the-automation-portfolio.git
   cd the-automation-portfolio
Ensure ChromeDriver is in your PATH (or configure the path in code)

# Build & run tests

mvn clean test
📈 Test Reports
Test results appear in the console by default.

To generate an HTML report with Allure (optional):

mvn clean test allure:serve

# 🔮 Next Steps
Add WebDriverWait for dynamic content

Integrate Allure with screenshots on failure

Implement parallel test execution (JUnit 5)

Configure CI/CD (GitHub Actions) for automatic runs

# 👩‍💻 Author
Kateryna Orlyk
QA Automation Engineer
LinkedIn: www.linkedin.com/in/kateryna-orlyk-a67a9b264
