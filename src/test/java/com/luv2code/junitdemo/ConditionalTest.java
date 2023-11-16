package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalTest {

    @Test
    @Disabled("Do not run this test until JIRA #123 is resolved")
    void basicTest() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        // execute method and perform asserts
    }
    @Test
    @EnabledIfSystemProperty(named = "java.version", matches = "20.*")
    void testForOnlyJava20() {
        // execute method and perform asserts
    }
    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_17)
    void testForOnlyJavaRange() {
        // execute method and perform asserts
    }
    @Test
    @EnabledForJreRange(min = JRE.JAVA_13)
    void testForOnlyJava13() {
        // execute method and perform asserts
    }
    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV")
    void testForOnlyEnvironmentVariable() {
        // execute method and perform asserts
    }
    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testForOnlySystemProperty() {
        // execute method and
    }

}












































