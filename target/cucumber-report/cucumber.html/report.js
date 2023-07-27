$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "As a User I want to test Login functions.",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15113812400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I accept cookies",
  "keyword": "When "
});
formatter.match({
  "location": "TopMenuSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 325025900,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iAcceptCookies()"
});
formatter.result({
  "duration": 933068400,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User can not login with invalid credentials",
  "description": "",
  "id": "login-functionality;user-can-not-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter username \"Maitri\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enter password \"Maitri@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on login tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User login not success with message \"Incorrect username or password entered. Please try again\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.userClickOnLoginButton()"
});
formatter.result({
  "duration": 223714100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maitri",
      "offset": 21
    }
  ],
  "location": "TopMenuSteps.userEnterUsername(String)"
});
formatter.result({
  "duration": 1822673300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maitri@123",
      "offset": 21
    }
  ],
  "location": "TopMenuSteps.userEnterPassword(String)"
});
formatter.result({
  "duration": 485306500,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.userClickOnLoginTab()"
});
formatter.result({
  "duration": 1079815300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Incorrect username or password entered. Please try again",
      "offset": 37
    }
  ],
  "location": "TopMenuSteps.userLoginNotSuccessWithMessage(String)"
});
formatter.result({
  "duration": 2185213400,
  "status": "passed"
});
formatter.after({
  "duration": 721553500,
  "status": "passed"
});
formatter.uri("TopMenu.feature");
formatter.feature({
  "line": 1,
  "name": "Top Menu Test",
  "description": "As a user I want to test TopMenu",
  "id": "top-menu-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9481767800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I accept cookies",
  "keyword": "When "
});
formatter.match({
  "location": "TopMenuSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 45500,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iAcceptCookies()"
});
formatter.result({
  "duration": 1402265900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User can see all options in Top menu of Homepage",
  "description": "",
  "id": "top-menu-test;user-can-see-all-options-in-top-menu-of-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User can see all option on TopMenuBar",
  "rows": [
    {
      "cells": [
        "options"
      ],
      "line": 10
    },
    {
      "cells": [
        "Sports"
      ],
      "line": 11
    },
    {
      "cells": [
        "In:play"
      ],
      "line": 12
    },
    {
      "cells": [
        "Casino"
      ],
      "line": 13
    },
    {
      "cells": [
        "Live Casino"
      ],
      "line": 14
    },
    {
      "cells": [
        "Virtual Sports"
      ],
      "line": 15
    },
    {
      "cells": [
        "Promotions"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.userCanSeeAllOptionOnTopMenuBar(DataTable)"
});
formatter.result({
  "duration": 2412489000,
  "status": "passed"
});
formatter.after({
  "duration": 907276400,
  "status": "passed"
});
});