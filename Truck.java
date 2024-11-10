public class Truck implements Vehicle {

    static final int rentalRate =500;
    private String type;
    private int week ;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public int getWeek() {
        return week;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week*500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck type: " + getType());
        System.out.println("weekly Rental Rate: " + rentalRate );
        System.out.println("Rental Cost: " + calculateRentalCost());

    }
}
