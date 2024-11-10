public class Car implements Vehicle {

static final int rentalRate =50;
    private String model;
    private int day;


    public Car(String model, int day) {
        this.model = model;
        this.day = day;
    }

    public String getModel() {
        return model;
    }

    public int getDays() {
        return day;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDays(int days) {
        this.day = days;
    }

    @Override
    public double calculateRentalCost() {
        return day*50;
    }

    @Override
    public void displayDetails() {
        System.out.println("car model: " + getModel());
        System.out.println("Daily Rental Rate: " + rentalRate );
        System.out.println("Rental Cost: " + calculateRentalCost());


    }
}
