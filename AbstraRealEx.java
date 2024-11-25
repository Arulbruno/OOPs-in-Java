  import java.util.*;
  // Abstract class that defines a common blueprint for all shoes
abstract class Shoe {
    // Common attributes
    String brand;
    double price;

    // Constructor to initialize common attributes
    Shoe(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Abstract method (to be implemented by subclasses)
    abstract void wear();

    // Concrete method (common functionality for all shoes)
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

// SportsShoe class inherits from Shoe and provides its implementation for 'wear'
class SportsShoe extends Shoe {

    // Constructor to initialize SportsShoe-specific attributes
    SportsShoe(String brand, double price) {
        super(brand, price);
    }

    // Implementing the abstract method 'wear' for SportsShoe
    @Override
    void wear() {
        System.out.println("Wearing Sports Shoe, perfect for running!");
    }
}

// FormalShoe class inherits from Shoe and provides its implementation for 'wear'
class FormalShoe extends Shoe {

    // Constructor to initialize FormalShoe-specific attributes
    FormalShoe(String brand, double price) {
        super(brand, price);
    }

    // Implementing the abstract method 'wear' for FormalShoe
    @Override
    void wear() {
        System.out.println("Wearing Formal Shoe, suitable for business meetings!");
    }
}

public class AbstraRealEx {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=a.nextLine();
        String s1=a.nextLine();
        double d=0.0;
        if(a.hasNextDouble()){
            d=a.nextDouble();
        }
        double d1=0.0;
        if(a.hasNextDouble()){
            d1=a.nextDouble();
        }
        // Creating instances of different types of shoes
        Shoe sportsShoe = new SportsShoe(s, d);
        Shoe formalShoe = new FormalShoe(s1, d1);

        // Displaying details and wearing shoes
        sportsShoe.displayDetails();
        sportsShoe.wear();

        System.out.println();

        formalShoe.displayDetails();
        formalShoe.wear();
    }
}
