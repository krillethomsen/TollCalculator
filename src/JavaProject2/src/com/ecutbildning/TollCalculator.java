package com.ecutbildning;

import java.time.LocalDateTime;

public class TollCalculator {

    public int getTollFee(Vehicle vehicle, LocalDateTime[] localDateTimes) {
        int totalFee = 0;
            for (LocalDateTime date : localDateTimes) {
                totalFee += getTollFee(date, vehicle);
        }
        if(totalFee > 60)
            totalFee = 60;
        return totalFee;
    }

    public int getTollFee(final LocalDateTime date, Vehicle vehicle) {
        if(isTollFreeDate(date))
            return 0;
        else;
            int hour = Integer.valueOf(date.getHour());
            switch (hour){
                case 8:
                case 16:
                    return 18;
                default:
                    switch(vehicle){
                        case "car":
                            return 11;
                        case "mc":
                            return 8;
                        default:
                            return 0;
                    }
            }
        return 0;
    }

    private boolean isTollFreeDate(LocalDateTime date) {
        String day = String.valueOf(date.getDayOfWeek());
            if(day.toUpperCase() == "SATURDAY")
                return true;
            else if(day.toUpperCase() == "SUNDAY")
                return true;
            else;
                return false;
    }

}