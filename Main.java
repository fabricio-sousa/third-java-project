import java.util.Scanner;

import javax.print.event.PrintJobListener;

class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        Bicycle Bicycle = new Bicycle("Bianchi", "Green");
        Bicycle.printData();
        System.out.print("Enter distance to move: ");
        int bikemove = scanner.nextInt();
        Bicycle.run(bikemove);
        System.out.println("=================");

        Car Car = new Car("Ferrari", "Red");
        Car.printData();
        System.out.print("Enter distance to move: ");
        int toMove = scanner.nextInt();
        Car.run(toMove);
        System.out.println("-----------------");
        System.out.print("Enter amount to refuel: ");
        int refuel = scanner.nextInt();
        Car.charge(refuel);
    }
}