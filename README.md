<!-- LOGO -->
<br />
<h1>
<p align="center">
<img src="https://raw.githubusercontent.com/amank22/LogVue/main/main_logo_dark.svg#gh-dark-mode-only" alt="Logo" width="200">
<img src="https://raw.githubusercontent.com/amank22/LogVue/main/main_logo_light.svg#gh-light-mode-only" alt="Logo"  width="200">
</p>
</h1>
<p align="center">
    Template for <a href="https://github.com/amank22/LogVue/">LogVue</a> plugins.
    <br/>
    <br/>
    LogVue is a tool which helps in monitoring, analysing, exporting local analytics from Android device and to use SQL-Like query to filter logs on desktop!
    <br/>
</p>
<hr>

<p align="center">
    <a href="https://github.com/amank22/LogVue/releases/latest"><img alt="release" src="https://img.shields.io/github/v/release/amank22/logvue?color=brightgreen&label=latest%20release"/></a>
    <a href="https://github.com/amank22/LogVue/blob/main/LICENSE"><img alt="License" src="https://img.shields.io/github/license/amank22/logvue"/></a>
    <a href="#"><img alt="License" src="https://img.shields.io/badge/platform-windows%20%7C%20mac%20%7C%20linux-blue?cacheSeconds=maxAge"/></a>
</p>

## Analytics Supported

- Sample In-house analytics

## Install

- Copy packaged zip in logVue plugins directory.

## How to create a new plugin?

### Prerequisites

- JDK 18 is required to build this plugin (See download links below)
- Set JDK 18 for this project (Either by setting in gradle.properties or through gradle setting in intellij editors)

### Steps

- Use this repo as template
- Checkout your repository
- Change/Create plugin module in plugins directory (See sample)
- Add logVue api & pf4j dependencies as in sample's build.gradle file
- Create a file for plugin extending `Plugin(wrapper)` to listen to start/stop/delete events. See SamplePlugin.kt
- Create a file for extension where actual parsing of logs can be done. It needs to annotated with `@Extension` and must extend `LogEventParser`
- `filters()` should be used to define a list of tags which are supported by this plugin.
- `validate()` and `parse()` are used to consume analytics logs.
- Convert the logs in `LogItem` which takes eventName and other arguments in analytics.

## Issues?
Raise an issue on LogVue repository for any issues or discussion.

## JDK 18 Download links
- [18-linux-aarch64](https://download.java.net/java/early_access/jdk18/34/GPL/openjdk-18-ea+34_linux-aarch64_bin.tar.gz)
- [18-linux-x64](https://download.java.net/java/early_access/jdk18/34/GPL/openjdk-18-ea+34_linux-x64_bin.tar.gz)
- [18-linux-x64-musl](https://download.java.net/java/early_access/alpine/11/binaries/openjdk-18-ea+11_linux-x64-musl_bin.tar.gz)
- [18-macos-aarch64](https://download.java.net/java/early_access/jdk18/34/GPL/openjdk-18-ea+34_macos-aarch64_bin.tar.gz)
- [18-macos-x64](https://download.java.net/java/early_access/jdk18/34/GPL/openjdk-18-ea+34_macos-x64_bin.tar.gz)
- [18-windows-x64](https://download.java.net/java/early_access/jdk18/34/GPL/openjdk-18-ea+34_windows-x64_bin.zip)