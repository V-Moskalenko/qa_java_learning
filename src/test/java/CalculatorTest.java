import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void initTest() {
        calculator = new Calculator();
        System.out.println("inside @BeforeAll");
    }

    @AfterAll
    static void afterTest() {
        calculator = null;
        System.out.println("inside @AfterAll");
    }

    @Test
    @DisplayName("TEST 1")
    void getSum() throws Exception {
        System.out.println("inside SumTest");
        assertEquals(15, calculator.getSum(7,8));
        assertNotEquals(16, calculator.getSum(8,7));
        assertEquals(15, calculator.getSum(7,9), "Error in SumTest");
    }

    @Test
    @DisplayName("TEST 2")
    void getDivide() throws Exception{
        System.out.println("inside DivideTest");
        assertEquals(20, calculator.getDivide(100,5));
        assertNotEquals(16, calculator.getDivide(10,1));
    }

    @Test
    @DisplayName("TEST 3")
    void getMultiple() throws Exception{
        System.out.println("inside MultipleTest");
        assertEquals(8, calculator.getMultiple(4,2));
        assertNotEquals(1, calculator.getMultiple(1,0));
    }

}