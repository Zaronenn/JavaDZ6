import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;




public class StatsServiceTest {
    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calcAllSalesSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calcAllSalesSum(monthlySales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcAverageSalesAmount() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calcAverageSalesAmount(monthlySales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcMaximumSalePerMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maximumSalePerMonth(monthlySales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcMinSalePerMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSalePerMonth(monthlySales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcSalesBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesBelowAverage(monthlySales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcSalesAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesAboveAverage(monthlySales);
        Assertions.assertEquals(expected, actual);
    }
}
