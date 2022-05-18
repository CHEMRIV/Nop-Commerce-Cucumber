$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As a user I want to login in to nopcommerce website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "Register Test",
  "description": "As a user I want to register in to nopcommerce website",
  "id": "register-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6334631300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#"
    },
    {
      "line": 4,
      "value": "#  Scenario: User should navigate to register page successfully"
    },
    {
      "line": 5,
      "value": "#    Given I am on homePage"
    },
    {
      "line": 6,
      "value": "#    When I click on register link"
    },
    {
      "line": 7,
      "value": "#    Then I should navigate to register page successfully"
    },
    {
      "line": 9,
      "value": "#  Scenario: User should that first name is Mandatory"
    },
    {
      "line": 10,
      "value": "#    Given I am on homePage"
    },
    {
      "line": 11,
      "value": "#    When I click on register link"
    },
    {
      "line": 12,
      "value": "#    And I click on register button"
    },
    {
      "line": 13,
      "value": "#    Then verify mandatoryField"
    },
    {
      "line": 14,
      "value": "#    And I am verify First name is required"
    },
    {
      "line": 15,
      "value": "#    And I am verify last name is required"
    },
    {
      "line": 16,
      "value": "#    And I am verify Email is required"
    },
    {
      "line": 17,
      "value": "#    And I am verify Password is required"
    },
    {
      "line": 18,
      "value": "#    And I am verify conformed Password is required"
    }
  ],
  "line": 20,
  "name": "User should verify that register account created successfully",
  "description": "",
  "id": "register-test;user-should-verify-that-register-account-created-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I am on homePage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I am click on gender-female button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I am enter first name \"Ronika\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I am enter last name \"Shah\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I am enter email id \"roni123@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I am enter password \"123456\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I am enter conformed password \"123456\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I am register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_homePage()"
});
formatter.result({
  "duration": 165505700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 561499600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iAmClickOnGenderFemaleButton()"
});
formatter.result({
  "duration": 90204300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ronika",
      "offset": 23
    }
  ],
  "location": "RegisterSteps.iAmEnterFirstName(String)"
});
formatter.result({
  "duration": 126426400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shah",
      "offset": 22
    }
  ],
  "location": "RegisterSteps.iAmEnterLastName(String)"
});
formatter.result({
  "duration": 95416400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "roni123@gmail.com",
      "offset": 21
    }
  ],
  "location": "RegisterSteps.iAmEnterEmailId(String)"
});
formatter.result({
  "duration": 125078000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 21
    }
  ],
  "location": "RegisterSteps.iAmEnterPassword(String)"
});
formatter.result({
  "duration": 94771800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 31
    }
  ],
  "location": "RegisterSteps.iAmEnterConformedPassword(String)"
});
formatter.result({
  "duration": 86874400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 20096153200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[contains(text(),\u0027Log in\u0027)]\"}\n  (Session info: chrome\u003d101.0.4951.54)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027REEVU\u0027, ip: \u0027192.168.0.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [9b3dbda0bac9f4899f69b1176f039f33, findElement {using\u003dxpath, value\u003d//button[contains(text(),\u0027Log in\u0027)]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.54, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\beena\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51819}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:51819/devtoo..., se:cdpVersion: 101.0.4951.54, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9b3dbda0bac9f4899f69b1176f039f33\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat com.nopcommerce.demo.utility.Utility.clickOnElement(Utility.java:53)\r\n\tat com.nopcommerce.demo.pages.LoginPage.clickOnLoginButton(LoginPage.java:60)\r\n\tat com.nopcommerce.demo.steps.LoginSteps.iClickOnLoginButton(LoginSteps.java:47)\r\n\tat ✽.And I click on login button(Register.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RegisterSteps.iAmRegisterSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1065865300,
  "status": "passed"
});
});