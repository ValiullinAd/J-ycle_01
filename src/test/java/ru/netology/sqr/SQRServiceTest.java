package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSQR() {
        SQRService service = new SQRService();
        int lowTest = 100;
        int highTest = 200;
        int expected = 5;
        int actual = service.calculateSQR(lowTest,highTest);

        assertEquals(expected, actual);
    }
}
