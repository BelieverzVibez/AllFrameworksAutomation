$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium/Believerz/Automation/src/test/java/FeatureFiles/facebook.feature");
formatter.feature({
  "line": 2,
  "name": "facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wholeFile"
    }
  ]
});
formatter.before({
  "duration": 7106577800,
  "status": "passed"
});
formatter.before({
  "duration": 142400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "login into facebook application",
  "description": "",
  "id": "facebook-login;login-into-facebook-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@aravind"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launching the facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"selva\" and \"raj\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click login button in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User validate homepage",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDefinition.user_launching_the_facebook_application()"
});
formatter.result({
  "duration": 302943700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selva",
      "offset": 13
    },
    {
      "val": "raj",
      "offset": 25
    }
  ],
  "location": "FacebookStepDefinition.user_enters_and_in_login_page(String,String)"
});
formatter.result({
  "duration": 6281655400,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDefinition.user_click_login_button_in_login_page()"
});
formatter.result({
  "duration": 21600,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDefinition.user_validate_homepage()"
});
formatter.result({
  "duration": 16100,
  "status": "passed"
});
formatter.after({
  "duration": 73700,
  "status": "passed"
});
formatter.after({
  "duration": 719035100,
  "status": "passed"
});
});