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
        int carmove = scanner.nextInt();
        Car.run(carmove);

    }
}