package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("BeforeEach executes before the execution of each method test");
    }

    @Test
    @DisplayName("Equals and not Equals")
    @Order(1)
    public void test_Equals_And_Not_Equals() {

        assertEquals(6, demoUtils.add(2, 4), " 2 + 4 must be 6");
        assertNotEquals(6, demoUtils.add(4, 4), " 4 + 4 must not be 6");
    }

    @Test
    @DisplayName("Null and not Null")
    @Order(38)
    public void test_Null_And_Not_Null() {

        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "object must be null");
        assertNotNull(demoUtils.checkNull(str2), "object must not be null");
    }

    @Test
    @DisplayName("Same and not same")
    @Order(0)
    void testSameAndNotSame() {

        String str = "luv2code";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(),
                "Objects should refer to the same object");

        assertNotSame(str, demoUtils.getAcademy(),
                "Objects should not refer to the same object");
    }

    @Test
    @DisplayName("True and False")
    @Order(-4)
    void testTrueAndFalse() {

        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @Test
    @DisplayName("Array Equals")
    @Order(55)
    void testArrayEquals() {

        String[] stringArray = {"A", "B", "C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(),
                "Arrays should be the same");
    }

    @Test
    @DisplayName("Iterable equals")
    void testIterableEquals() {

        List<String> theList = List.of("luv", "2", "code");
        assertIterableEquals(theList, demoUtils.getAcademyInList(),
                "Expected list should be the same as the actual list");
    }

    @Test
    @DisplayName("Lines match")
    void testLinesMatch() {

        List<String> theList = List.of("luv", "2", "code");
        assertLinesMatch(theList, demoUtils.getAcademyInList(),
                "Lines should match");
    }

    @Test
    @DisplayName("Throws and does not throw")
    void testThrowsAndDoesNotThrow() {

        assertThrows(Exception.class, () -> {demoUtils.throwException(-1); },
                "should throw exception ");

        assertDoesNotThrow(() -> {demoUtils.throwException(5); },
                "should not throw exception ");
    }

    @Test
    @DisplayName("TimeOut")
    void testTimeOut() {

        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {demoUtils.checkTimeout();},
                "Method should execute in 3 seconds");
    }

    @Test
    @DisplayName("Multiply")
    void testMultiply() {

        assertEquals(12, demoUtils.multiply(6, 2),
                "6 * 2 must be 12");
    }



































    /*

     @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running AfterEach");
        System.out.println();
    }

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("BeforeAll executes before the execution of each method");
        System.out.println();
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("AfterAll executes after the execution of each method ");
        System.out.println();
    }

     */
}


