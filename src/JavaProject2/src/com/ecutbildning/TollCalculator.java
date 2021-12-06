package com.ecutbildning;

import java.time.LocalDateTime;

public class TollCalculator {

    public int getTollFee(Vehicle vehicle, LocalDateTime[] localDateTimes) {
        //Ska räkna ut fee, max 60
        int totalFee = 0;
        for (LocalDateTime dates : localDateTimes) {

        }

        return totalFee;
    }

    public int getTollFee(final LocalDateTime[] localDateTimes, Vehicle vehicle) {
        if(isTollFreeDate(localDateTimes))
            return 0;

        for (LocalDateTime dates : localDateTimes) {
            int hour = Integer.valueOf(dates.getHour());
            if(hour == 8)
                return 18;
            else if(hour == 16)
                return 18;
            else;
                if(vehicle == Car)
                    return 11;
                else if(vehicle == Motorcycle);
                    return 8;
        }
        return 0;
    }

    private boolean isTollFreeDate(LocalDateTime[] localDateTime) {
        for (LocalDateTime dates : localDateTime) {
                String day = String.valueOf(dates.getDayOfWeek());
                if(day.toUpperCase() == "SATURDAY")
                    return true;
                else if(day.toUpperCase() == "SUNDAY")
                 return true;
        }
        return false;
    }

}