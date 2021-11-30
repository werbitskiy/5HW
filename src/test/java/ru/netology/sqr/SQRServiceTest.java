package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSqrtDist() {
        SQRService service = new SQRService();

        int expected = 3;
        int minSet = 200;
        int maxSet = 300;

        int actual = service.SqrtDist(minSet,maxSet);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSqrtDistOtherSet() {
        SQRService service = new SQRService();

        int expected = 14;
        int minSet = 150;
        int maxSet = 700;

        int actual = service.SqrtDist(minSet,maxSet);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSqrtDistNegative() {
        SQRService service = new SQRService();

        int expected = 9;
        int minSet = 20;
        int maxSet = 300;

        int actual = service.SqrtDist(minSet,maxSet);

        assertEquals(expected,actual);
    }
}