# Purpose
The purpose of this project is to provide a convenient way to reproduce the defect described in [TAP5-2605](https://issues.apache.org/jira/browse/TAP5-2605).

#Contents
The repository contains a minimalistic Tapestry app. The app consists of just one page containing the configuration settings that appear to play a role.

The gradle build script provided offers tasks to launch a servlet container and let it serve the app.

# Usage
    ./gradlew <task> <properties>
    
Tasks

    runProd         - production mode (with minification activated by default)
    runProdNoMini   - production mode (with minification explicitly switched off)
    runDev          - development mode (with minification switched off by default)
    runDevWithMini  - development mode (with minification explicitly switched on)

Properties (optional)

    -PwithWebresources            - have the tapestry-webresources module inlcuded in the classpath and hence autoloaded.
    -PtapestryVersion=<version>   - change the Tapestry version (default is 5.5.0)


Example

    ./gradlew runProd -PwithWebresources -PtapestryVersion=5.6.1
