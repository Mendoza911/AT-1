package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void ShouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 900;

        int actual = service.remain(boundary);
        int exected = 100;
        assertEquals(actual, exected);
    }

    @Test
    void ShouldBuyForCashback() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 0;

        int actual = service.remain(boundary);
        int exected = 1000;
        assertEquals(actual, exected);

    }

    @Test
    void ShouldCalculateOneMoreBuyForCashback() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 1000;

        int actual = service.remain(boundary);
        int exected = 1000;
        assertEquals(actual, exected);

    }

    @Test
    void ShouldCalculateMoreCashback() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 1300;

        int actual = service.remain(boundary);
        int exected = 700;
        assertEquals(actual, exected);

    }

}
