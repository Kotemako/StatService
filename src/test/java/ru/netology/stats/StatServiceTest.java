package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatServiceTest {

    @Test
    public void sum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void average() {
        StatService service = new StatService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.average(array);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxSales() {
        StatService service = new StatService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxDay = 8;
        long actualMaxDay = service.maxSales(array);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }

    @Test
    public void minSales() {
        StatService service = new StatService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinDay = 9;
        long actualMinDay = service.minSales(array);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void avgLess() {
        StatService service = new StatService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedLessAverage = 5;
        long actualLessAverage = service.avgLess(array);

        Assertions.assertEquals(expectedLessAverage, actualLessAverage);
    }

    @Test
    public void avgOver() {
        StatService service = new StatService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMoreAverage = 5;
        long actualMoreAverage = service.avgOver(array);

        Assertions.assertEquals(expectedMoreAverage, actualMoreAverage);
    }
}
