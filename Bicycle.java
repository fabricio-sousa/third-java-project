class Bicycle {
    private String name;
    private String color;

    Bicycle(String name, String color) {
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
        
      }

}