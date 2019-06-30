# Demo

How to run ?
```
$mvn clean test

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running FireFoxTest
1561895218923   mozrunner::runner       INFO    Running command: "/Applications/Firefox.app/Contents/MacOS/firefox-bin" "-marionette" "-foreground" "-no-remote" "-profile" "/var/folders/z3/v37g1d5s3rs_gz5wbmhqpnyw0000gn/T/rust_mozprofile.DZDrCRz1niwg"
1561895220114   addons.webextension.screenshots@mozilla.org     WARN    Loading extension 'screenshots@mozilla.org': Reading manifest: Invalid extension permission: mozillaAddons
1561895220115   addons.webextension.screenshots@mozilla.org     WARN    Loading extension 'screenshots@mozilla.org': Reading manifest: Invalid extension permission: resource://pdf.js/
1561895220115   addons.webextension.screenshots@mozilla.org     WARN    Loading extension 'screenshots@mozilla.org': Reading manifest: Invalid extension permission: about:reader*
1561895221930   Marionette      INFO    Listening on port 49698
1561895222024   Marionette      WARN    TLS certificate errors will be ignored for this session
Jun 30, 2019 6:47:02 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
1561895224072   Marionette      INFO    Stopped listening on port 49698
JavaScript error: resource://gre/modules/WebProgressChild.jsm, line 61: TypeError: this.mm.content is null
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.325 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

```

Warning ที่เกิดขึ้นไม่มีผลต่อการทดสอบ [Issue#1483](https://github.com/mozilla/geckodriver/issues/1483)
