package practise.car_rental.strategy;


import practise.car_rental.reservation.Reservation;

public interface PricingStrategy {

    double calculatePrice(Reservation reservation);
}