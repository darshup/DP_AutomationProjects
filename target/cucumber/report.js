$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/BackgroundColor.feature");
formatter.feature({
  "line": 1,
  "name": "Background Color Functionality;",
  "description": "",
  "id": "background-color-functionality;",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Sky Blue Background"
    },
    {
      "line": 4,
      "value": "#\tGiven Set SkyBlue Background button exists"
    },
    {
      "line": 5,
      "value": "#\tWhen I click on the button"
    },
    {
      "line": 6,
      "value": "#\tThen the background color will change to sky blue"
    },
    {
      "line": 7,
      "value": "#"
    },
    {
      "line": 8,
      "value": "#Scenario: White Background Change"
    },
    {
      "line": 9,
      "value": "#\tGiven Set SkyWhite Background button exists"
    },
    {
      "line": 10,
      "value": "#\tWhen I click on the button"
    },
    {
      "line": 11,
      "value": "#\tThen the background color will change to white"
    }
  ],
  "line": 13,
  "name": "",
  "description": "",
  "id": "background-color-functionality;;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "\"\u003cbutton\u003e\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on the \"\u003ccolor\u003e\" button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the background color will change to \"\u003ccolor\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "background-color-functionality;;;",
  "rows": [
    {
      "cells": [
        "button",
        "color"
      ],
      "line": 18,
      "id": "background-color-functionality;;;;1"
    },
    {
      "cells": [
        "Set SkyBlue Background",
        "sky blue"
      ],
      "line": 19,
      "id": "background-color-functionality;;;;2"
    },
    {
      "cells": [
        "Set SkyWhite Background",
        "white"
      ],
      "line": 20,
      "id": "background-color-functionality;;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3918512900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "background-color-functionality;;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "\"Set SkyBlue Background\" button exists",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on the \"sky blue\" button",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the background color will change to \"sky blue\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "SetBackgroundColorDefinition.button_exists(String)"
});
formatter.result({
  "duration": 135870600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sky blue",
      "offset": 16
    }
  ],
  "location": "SetBackgroundColorDefinition.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 95360100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sky blue",
      "offset": 37
    }
  ],
  "location": "SetBackgroundColorDefinition.the_background_color_will_change_to(String)"
});
formatter.result({
  "duration": 141751100,
  "status": "passed"
});
formatter.after({
  "duration": 714782700,
  "status": "passed"
});
formatter.before({
  "duration": 2720646300,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "background-color-functionality;;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "\"Set SkyWhite Background\" button exists",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on the \"white\" button",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the background color will change to \"white\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyWhite Background",
      "offset": 1
    }
  ],
  "location": "SetBackgroundColorDefinition.button_exists(String)"
});
formatter.result({
  "duration": 76100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "white",
      "offset": 16
    }
  ],
  "location": "SetBackgroundColorDefinition.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 68948400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "white",
      "offset": 37
    }
  ],
  "location": "SetBackgroundColorDefinition.the_background_color_will_change_to(String)"
});
formatter.result({
  "duration": 62302900,
  "status": "passed"
});
formatter.after({
  "duration": 677118600,
  "status": "passed"
});
});