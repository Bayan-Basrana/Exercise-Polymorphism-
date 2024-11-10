public class Bike implements Vehicle{
    static final int rentalRate =10;
    private String brand;
    private int hours;

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public double calculateRentalCost() {
        return hours*10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike brand: " + getBrand());
        System.out.println("Hours Rental Rate: " + rentalRate );
        System.out.println("Rental Cost: " + calculateRentalCost());


    }
}
