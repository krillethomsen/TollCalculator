package Test;

import Main.Car;
import Main.MotorBike;
import Main.TollCalculator;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.LocalDateTime;

public class TollCalculatorTest {
    @Test
    public void test(){
        TollCalculator tollCalculator = new TollCalculator();
        Car car = new Car();
        MotorBike mc = new MotorBike();
        int rushHourFee = tollCalculator.getTollFee(LocalDateTime.of(2021, 12, 1, 16, 25, 52), mc);
        int carFee = tollCalculator.getTollFee(LocalDateTime.of(2021, 12, 3, 10, 25, 15), car);
        int mcFee = tollCalculator.getTollFee(LocalDateTime.of(2021, 11, 9, 9, 25, 53), mc);

        int[] actual = {rushHourFee, carFee, mcFee};

        int[] expected = {18, 11, 8};

        Assert.assertEquals(actual, expected);
        System.out.println("mainTest = OK!");

    }
}
