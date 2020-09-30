package reviewfortest;

public class car {
    
    private String make;
    private String model;
    private int year;
    private double price;
    
    public car (String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public String toString() {
        String str;
        str = "Make:\t" + make;
        str += "\nModel:\t" + model;
        str += "\nYear:\t" + year;
        str += "\nprice:\t" + price;
        return str;
    }
    
    public double getPrice(){
        double price;
    }
    
    public int getAge(){
        int age = 2020 - year;
        return age;
    }
    
    private void depreciate(){
        for (int i = year; i == 2020; i++) {
            price = price - (30 *price);
            
        }
    }
}
