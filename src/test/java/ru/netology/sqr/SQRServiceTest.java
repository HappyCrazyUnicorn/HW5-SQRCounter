package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'bounds in limit',200,300,3",
                    "'bounds under limit',10,90,0",
                    "'bounds more than limits',10000,11000,0"
            }
    )
    void shouldCount(String test, int leftBound, int rightBound, int expected) {
        SQRService service = new SQRService();

        int actual = service.counter(leftBound, rightBound);
        assertEquals(expected, actual);

    }
}