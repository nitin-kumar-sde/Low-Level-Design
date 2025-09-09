package practise.car_rental.strategy;

import practise.car_rental.reservation.Reservation;

import java.time.Duration;

public class PerHourPricingStrategy implements PricingStrategy {
    private final double ratePerHour;

    public PerHourPricingStrategy(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculatePrice(Reservation reservation) {
        long hours = Duration.between(
                reservation.getStartTime(), reservation.getEndTime()
        ).toHours();
        return hours * ratePerHour;
    }
}

