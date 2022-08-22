package ru.netology.qai.task1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testNormalRange() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.numericInRange(200, 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinimalRange() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.numericInRange(200, 201);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testOutRangeUpper() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.numericInRange(10000, 30000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testOutRangeLower() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.numericInRange(10, 30);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNormalRangeWithReverseLimits() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.numericInRange(300, 200);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testEqualLimits() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.numericInRange(200, 200);

        Assertions.assertEquals(expected, actual);
    }
}
