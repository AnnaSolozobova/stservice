package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        long average = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }

        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        long average = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }

        }
        return count;
    }
}
