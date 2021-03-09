import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MathUtilsTest {
//    @Test
//    void add() {
//    }
    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int expected = 30;
        int actual = mathUtils.add(10, 20);
        assertEquals(expected, actual, "the add method should add two numbers");
//        if (expected != actual )
//            System.out.println("this test ran mwah");

//        fail ("not yet implemented");

    }
    @Test
    void testComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        double expected = 1;
        double actual = mathUtils.computeCircleArea(20);
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "the method should calculate the area of a circle based on radius" );

    }

//
//    @org.junit.jupiter.api.Test
//    void subtract() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void multiply() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void divide() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void computeCircleArea() {
//    }
}