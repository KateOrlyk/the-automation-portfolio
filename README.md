# the-automation-portfolio

**Automation portfolio:** Selenium WebDriver + JUnit tests for [the-internet.herokuapp.com](https://the-internet.herokuapp.com/)

---

## 📁 Project Structure

- **the-automation-portfolio/**
    - **src/**
        - **test/**
            - **java/**
                - **core/** &ndash; BaseTest, BasePage and utilities
                - **pages/** &ndash; Page Object classes
                - **tests/** &ndash; Test classes
- **pom.xml** &ndash; Maven configuration
- **README.md** &ndash; Project overview and instructions
- **.gitignore** &ndash; Ignored files

---

## 🚀 Technologies

- **Java 17** (Eclipse Temurin)
- **Selenium 4** WebDriver
- **JUnit 5** (junit-jupiter & params)
- **Maven**
- **ChromeDriver**

---

## 📋 Test Scenarios

1. **Login Page**
    - Positive & negative flows, parameterized tests
2. **Checkboxes**
    - Toggle checkboxes, verify state
3. **JavaScript Alerts**
    - `alert()`, `confirm()`, `prompt()`
4. **(Coming soon)**
    - Dynamic Loading
    - Dropdowns
    - …and more

---

## ⚙️ Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/KateOrlyk/the-automation-portfolio.git
   cd the-automation-portfolio
2. **Ensure ChromeDriver is in your PATH**
3. **Run tests**
   ```bash
   mvn clean test

---

## 📈 Allure Reports

1. **Install Allure CLI** (choose one):
- Scoop (Windows, non-admin PowerShell)
  ```powershell
   Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
   iwr -useb get.scoop.sh | iex
   scoop install allure
- **Chocolatey (Windows)**
    ```powershell
  choco install allure.commandline -y
- **Homebrew (macOS)**
    ```bash
    brew install allure
- **Manual**
Download ZIP from [Allure Releases](https://github.com/allure-framework/allure2/releases), unpack, and add bin/ to your PATH.

2. **Generate and view report**
    ```bash
   allure serve allure-results

3. **(Optional) via Maven**
    ```bash
   mvn clean test verify
    mvn allure:serve

---

## 🔮 Next Steps
- Add explicit waits (`WebDriverWait`)
- Capture screenshots on failure
- Enable parallel test execution (JUnit 5)
- Configure CI/CD (GitHub Actions)

---

👩‍💻 Author
Kateryna Orlyk
QA Automation Engineer
[LinkedIn](https://www.linkedin.com/in/kateryna-orlyk-a67a9b264/)