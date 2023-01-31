
public class SQRServiceTest package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "120, 250, 10",
            "121, 250, 9",
            "130, 140, 0",
            "180, 190, 1",
            "100, 400, 25"
    })
    void testCountSquaredNumbersInRange(int min, int max, int expectedResult) {
        SQRService service = new SQRService();
        int actualResult = service.countSquaredNumbersInRange(min, max);
        assertEquals(expectedResult, actualResult);
    }
}
