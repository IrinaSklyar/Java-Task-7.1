package ru.netology.statics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @org.junit.jupiter.api.Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void testFindMax() {
        StatisticsService service = new StatisticsService();

        long[] current_max = {0,4,7,8,-1};
        long expected = 8;

        long actual = service.findMax(current_max);

        assertEquals(expected, actual);
        }
}
