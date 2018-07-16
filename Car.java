class Car {
    private String name;
    private String color;
    private int distance = 0;
    private int fuel = 100;

    Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void printData() {
        System.out.println("[Car Info]");
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Distance: " + this.distance + "km");
        System.out.println("Fuel: " + this.fuel + "L");
        System.out.println("-----------------");
        
      }
      
    public void run(int moved) {
      System.out.println("Moving " + moved + "km ...");
      this.distance = this.distance + moved;
      System.out.println("Distance: " + this.distance + "km");
    }

}