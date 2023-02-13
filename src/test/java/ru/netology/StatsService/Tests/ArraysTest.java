package ru.netology.StatsService.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Arrays;

public class ArraysTest {


    @Test
    public void shouldFindBetweenMinSale() {
        Arrays service = new Arrays();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindBetweenMaxSale() {
        Arrays service = new Arrays();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expected = 6;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindAmountSales() {
        Arrays service = new Arrays();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        long actual = service.amountSales(sales);
        long expected = 176;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindAverageAmountSales() {
        Arrays service = new Arrays();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        long actual = service.averageAmountSales(sales);
        long expected = 14;


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMinAverageSales() {
        Arrays service = new Arrays();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int actual = service.minAverageSales(sales);
        long expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxAverageSales() {
        Arrays service = new Arrays();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int actual = service.maxAverageSales(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }

}
