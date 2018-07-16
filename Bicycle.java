class Bicycle {
    private String name;
    private String color;
    private int distance = 0;

    Bicycle(String name, String color, int distance) {
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
        System.out.println("[Bicycle Info]");
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Distance: " + this.distance + "km.");
        System.out.println("-----------------");
        this.run(10);
        
      }
      
    public void run(int moved) {
      System.out.println("Moving " + moved + "km ...");
      this.distance = this.distance + moved;
      System.out.println("Distance: " + this.distance + "km");
    }

}