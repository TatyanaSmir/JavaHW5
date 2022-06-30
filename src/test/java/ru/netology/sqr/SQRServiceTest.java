package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRParam.csv")
    public void testGettingIntoRange(int expected, int minLimit, int maxLimit) {
        SQRService service = new SQRService();

        int actual = service.calcSqrOfNumber(minLimit, maxLimit);

        Assertions.assertEquals(expected, actual);
    }


}
