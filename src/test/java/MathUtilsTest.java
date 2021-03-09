import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    void beforeAllInit(){
        System.out.print("This will run before all. ");
    }
    @BeforeEach
    void init (){
         mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup(){
        System.out.print("cleaning up...");
    }
    @Test
    @DisplayName("Testing add method. ")
    void testAdd() {
        int expected = 30;
        int actual = mathUtils.add(10, 20);
        assertEquals(expected, actual, "the add method should add two numbers ");
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