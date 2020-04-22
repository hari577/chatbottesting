$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginFingerTip.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Jyothi G"
    }
  ],
  "line": 4,
  "name": "Fingertip Login test cases",
  "description": "",
  "id": "fingertip-login-test-cases",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@fingerTipLogin"
    }
  ]
});
formatter.before({
  "duration": 5788267588,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate login functionlity",
  "description": "",
  "id": "fingertip-login-test-cases;validate-login-functionlity",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user launches Url of fingertip",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user validate fingertip text in home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FingerTipStepDefi.user_launches_Url_of_fingertip()"
});
formatter.result({
  "duration": 2897911759,
  "status": "passed"
});
formatter.match({
  "location": "FingerTipStepDefi.user_enters_username_and_password()"
});
formatter.result({
  "duration": 419389863,
  "status": "passed"
});
formatter.match({
  "location": "FingerTipStepDefi.user_click_on_login_button()"
});
formatter.result({
  "duration": 11905789274,
  "status": "passed"
});
formatter.match({
  "location": "FingerTipStepDefi.user_validate_fingertip_text_in_home_page()"
});
formatter.result({
  "duration": 668711203,
  "status": "passed"
});
formatter.after({
  "duration": 190726,
  "status": "passed"
});
formatter.after({
  "duration": 1208463122,
  "status": "passed"
});
});