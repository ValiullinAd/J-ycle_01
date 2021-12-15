package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

<<<<<<< HEAD
    @ParameterizedTest
    @CsvSource(
            value = {
                    "100,200,5",
                    "100,199,5",
                    "100,201,5",
                    "99,199,5",
                    "99,201,5",
                    "99,200,5",
                    "101,199,4",
                    "101,200,4",
                    "101,199,4"
            },
            delimiter = ','
    )
    void shouldCalculateSQR(int lowTest, int highTest, int expected) {
=======
    @Test
    void shouldCalculateSQR() {
>>>>>>> 8cdafa508e1a63341606cac90d874d2f1ff8f780
        SQRService service = new SQRService();
        //int lowTest = 100;
        //int highTest = 200;
        //int expected = 5;
        int actual = service.calculateSQR(lowTest,highTest);

        assertEquals(expected, actual);
    }
}
