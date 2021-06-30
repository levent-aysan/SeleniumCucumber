$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Downloads/selenCumber201803/src/test/resources/java/interviewMegi/Login.feature");
formatter.feature({
  "line": 1,
  "name": "To test my cucumber test is running",
  "description": "I want to run a sample feature file.",
  "id": "to-test-my-cucumber-test-is-running",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "cucumber setup okay",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running;cucumber-setup-okay",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "my feature file is ready",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I run the feature file",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "run should be successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Login.whenStatement()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.thenStatment()"
});
formatter.result({
  "status": "skipped"
});
});