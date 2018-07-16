import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycle Bicycle = new Bicycle("Bianchi", "Green", 0);
        Bicycle.printData();
        System.out.print("Enter distance to move: ");
        int distance = scanner.nextInt();
        Bicycle.run(distance);
        
    }
}