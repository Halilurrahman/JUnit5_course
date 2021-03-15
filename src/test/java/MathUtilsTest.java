import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    MathUtils mathUtils;
    private TestInfo testInfo;
    private TestReporter testReporter;

    @BeforeAll
    void beforeAllInit(){
        System.out.print("This will run before all. ");
    }

    @BeforeEach
    void init (TestInfo testInfo, TestReporter testReporter){
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        System.out.println("Running: " + testInfo.getDisplayName() + " with following tags: " + testInfo.getTags());
        testReporter.publishEntry("Running: " + testInfo.getDisplayName() + " with following tags: " + testInfo.getTags());
         mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup(){
        System.out.println("cleaning up...");
    }

    @Nested
    class SimpleArithmaticTest {
        @Test
        @DisplayName("Testing add method. ")
        void testAdd() {
            int expected = 30;
            int actual = mathUtils.add(10, 20);
            assertEquals(expected, actual, "the add method should add two numbers ");
        }
        @Test
        @DisplayName("testing calculation circle area")
        void testComputeCircleArea() {
            assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "the method should calculate the area of a circle based on radius" );
        }
    }
    @Test
    @DisplayName("Testing add method. ")
    void testAdd() {
        int expected = 30;
        int actual = mathUtils.add(10, 20);
        assertEquals(expected, actual, "the add method should add two numbers ");
    }

    @Test
    @DisplayName("Testing multiply method")
    @Tag("Math")
    void testMultiply() {

        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2,2)),
                () -> assertEquals(0, mathUtils.multiply(0,2)),
                () -> assertEquals(20, mathUtils.multiply(-2,-10))
        );
    }

    @Test
    @Disabled
    void testComputeCircleArea() {
              assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "the method should calculate the area of a circle based on radius" );
    }

    @Test
    void testDivide() {
//        assertEquals(3, mathUtils.divide(6,2), "The method should divide number a by b");
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0), "Divide by zero should throw exception");
    }

    
//    @org.junit.jupiter.api.Test
//    void subtract() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void multiply() {
//    }
//
//
//    @org.junit.jupiter.api.Test
//    void computeCircleArea() {
//    }
}