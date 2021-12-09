package Main;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        TollCalculator tollCalculator = new TollCalculator();
        Car car = new Car();
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 12, 1, 16, 25, 52);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 12, 3, 8, 25, 15);
        LocalDateTime localDateTime3 = LocalDateTime.of(2021, 12, 5, 13, 23, 32);
        LocalDateTime localDateTime4 = LocalDateTime.of(2021, 11, 9, 9, 25, 53);
        LocalDateTime[] localDateTimes = {localDateTime1, localDateTime2, localDateTime3, localDateTime4};
        int fee = tollCalculator.getTollFee(car, localDateTimes);

        System.out.println(fee + "kr");
    }


}
