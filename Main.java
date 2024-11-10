import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
int choice;
        ArrayList<Vehicle> rentedVehicle =new ArrayList<>();
do {
    System.out.println(" Vehicle Rental System");
    System.out.println("1. Rent a Car  ");
    System.out.println("2. Rent a Bike  ");
    System.out.println("3. Rent a Truck  ");
    System.out.println("4. View Rented Vehicles");
    System.out.println("5. total cost ");
    System.out.println("6. Exit");

    System.out.println(" Enter your choice ");
     choice = input.nextInt();

    switch (choice){
        case 1:
            System.out.print("Enter Car Model: ");
            String model = input.next();
            System.out.print("Enter Rental Days: ");
            int day = input.nextInt();
            Car car1=new Car(model,day);
            System.out.println("Rental Details:");
            rentedVehicle.add(car1);
            car1.displayDetails();
            break;
        case 2 :
            System.out.print("Enter bike Brand: ");
            String brand = input.next();
            System.out.print("Enter Rental hours: ");
            int hours = input.nextInt();
            Bike bike=new Bike(brand,hours);
            System.out.println("Rental Details:");
            rentedVehicle.add(bike);
            bike.displayDetails();
            break;
        case 3:
            System.out.print("Enter Truck type: ");
            String type = input.next();
            System.out.print("Enter Rental weeks: ");
            int week = input.nextInt();
            Truck truck=new Truck(type,week);
            System.out.println("Rental Details:");
            rentedVehicle.add(truck);
            truck.displayDetails();
            break;
        case 4:
            for (Vehicle v :rentedVehicle){
                v.displayDetails();
            System.out.println();}
            break;

        case 5 :
            double total=0;
            for( Vehicle v:rentedVehicle){
                total =total + v.calculateRentalCost();
            }
            System.out.println( "Total cost : " +total);
            break;
        case 6:
            System.out.println("Thank you for using the Vehicle Rental System! ");
            break;

        default:
            System.out.println(" invalid choice");
    }

}while (choice!=6);
    }


}