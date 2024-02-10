package Beans;



public class HouseholdProduct {
    private double pricePerMS;



    public HouseholdProduct(double pricePerMS) {
        this.pricePerMS = pricePerMS;
    }

    public double calculateSum(double area) {
        return this.pricePerMS * area;
    }
    public double getPricePerMS() {
        return pricePerMS;
    }
}
