import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SpeedingTicketTest {

    private static SpeedingTicket speedingTicket;

    @BeforeAll
    static void initTest(){
        speedingTicket = new SpeedingTicket();
        System.out.println("inside @BeforeAll");
    }

    @AfterAll
    static void afterTest(){
        speedingTicket = null;
        System.out.println("inside @AfterAll");
    }

    @ParameterizedTest(name = "{index}: {0}")
    @DisplayName("A parameterized test with named arguments speedLimit")
    @ValueSource(ints = {60, 40, 90, 120})
    void printSpeedingTicket(int limit) {
        assertNotNull(speedingTicket.printSpeedingTicket(limit, 140));
    }

}