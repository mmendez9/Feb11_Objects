package p1;

public class Main {
    public static void main(String[] args) {

        Balloon[] things = new Balloon[5];

        // Create a balloon object
        things[0] = new Balloon();

        // Create another balloon object
        things[1] = new Balloon(12, "yellow");

        // Create another balloon object
        things[2] = new Balloon(6, "red");

        // Print the number of balloons made
        System.out.printf("We made %d balloons%n", Balloon.getQuantity());

        // Destroy the second balloon
        Balloon.destroy(1, things);

        // Print the number of balloons have
        System.out.printf("We have %d balloons%n", Balloon.getQuantity());


        // Print the balloons' characteristics
        for(Balloon each : things) {
            // Don't print elements that are not defined
            if (each != null)
                System.out.printf("size %d inches, color is %s%n",
                        each.getSize(), each.getColor());
        }
    }
}

class Balloon {
    private int size;
    private String color;
    private static int quantity = 0;

    // Default constructor
    Balloon() {
        size = 10;
        color = "orange";
        quantity++;
    }

    // Constructor receives size & color
    Balloon(int s, String c) {
        size = s;
        color = c;
        quantity++;
    }

    // Return the size
    int getSize() {
        return size;
    }

    // Return the color
    String getColor() {
        return color;
    }

    // Return the number of balloons
    static int getQuantity() {
        return quantity;
    }

    public static void destroy(int i, Balloon[] arg) {
        quantity--;
        arg[i] = null;
    }
}
