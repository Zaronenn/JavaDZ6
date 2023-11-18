package ru.netology.stats;

public class StatsService {

    public int calcAllSalesSum(int[] monthlySales) { //сумма всех продаж
        int allSalesSum = 0;
        for (int monthOfSales : monthlySales) {
            allSalesSum += monthOfSales;

        }
        return allSalesSum;
    }

    public int calcAverageSalesAmount(int[] monthlySales) { //Средняя сумма продаж в месяц
        int allSalesSum = 0;
        for (int monthOfSales : monthlySales) {
            allSalesSum += monthOfSales;
        }
        return allSalesSum / monthlySales.length;
    }

    public int maximumSalePerMonth(int[] monthlySales) { //Пик продаж
        int maxSales = monthlySales[0];
        int i = 1;
        int monthOfMaxSales = 1;
        while (i < monthlySales.length) {
            if (monthlySales[i] >= maxSales) {
                maxSales = monthlySales[i];
                monthOfMaxSales = i + 1;
            }
            i++;
        }
        return monthOfMaxSales;
    }

    public int minSalePerMonth(int[] monthlySales) { // Минимум продаж
        int minSales = monthlySales[0];
        int monthOfMinSales = 1;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] <= minSales) {
                minSales = monthlySales[i];
                monthOfMinSales = i + 1;
            }
        }
        return monthOfMinSales;
    }

    public int salesBelowAverage(int[] monthlySales) { // Продажи ниже среднего
        double average = calcAverageSalesAmount(monthlySales);
        int monthsBelowAverage = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale > average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int salesAboveAverage(int[] monthlySales) { // Продажи выше среднего
        double average = calcAverageSalesAmount(monthlySales);
        int monthsAboveAverage = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale < average) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}
