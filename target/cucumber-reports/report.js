$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("chatbot.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: syed ibrahim taher"
    }
  ],
  "line": 4,
  "name": "Verify chatbot testing",
  "description": "",
  "id": "verify-chatbot-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@chatbot"
    }
  ]
});
formatter.before({
  "duration": 4366104640,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "verify-chatbot-testing;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@testcase1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user launches Url of usaphilips",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user click on Go to advisor button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "validate text \"Hello, I am your Sonicare Brush Head Advisor Bot\"",
  "keyword": "And "
});
formatter.match({
  "location": "chatbotstepdefinition.user_launches_Url_of_usaphilips()"
});
formatter.result({
  "duration": 12844704029,
  "status": "passed"
});
formatter.match({
  "location": "chatbotstepdefinition.user_click_on_Go_to_advisor_button()"
});
formatter.result({
  "duration": 219233095,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, I am your Sonicare Brush Head Advisor Bot",
      "offset": 15
    }
  ],
  "location": "chatbotstepdefinition.validate_text(String)"
});
formatter.result({
  "duration": 19698243015,
  "status": "passed"
});
formatter.after({
  "duration": 141548,
  "status": "passed"
});
formatter.after({
  "duration": 977260889,
  "status": "passed"
});
});