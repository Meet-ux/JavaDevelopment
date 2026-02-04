 // Enum representing different statuses with associated prices.
enum Status {

    // Enum constants with custom prices
    Running(1000),
    Failed(13334),
    Pending(3223),
    Success(4545);

    // Instance variable to store price of each enum constant
    private int price;

    // Default constructor (used if no value is passed)
    // This will set price = 500 (but not used in this code because every constant has a price)
    private Status() {
        price = 500;
    }

    // Parameterized constructor to set custom price for each enum constant
    private Status(int price) {
        this.price = price;
    }

    // Getter method to return price of the enum constant
    public int getPrice() {
        return price;
    }
}

public class Enums {

    public static void main(String[] args) {

        // Creating an enum reference pointing to Success constant
        Status s = Status.Success;

        // Using if-else conditions to check enum value
        if (s == Status.Running) {
            System.out.println("All Running");
        } else if (s == Status.Failed) {
            System.out.println("All Failed");
        } else if (s == Status.Pending) {
            System.out.println("All Pending");
        } else if (s == Status.Success) {
            System.out.println("All Done");
        }

        // Using switch-case to check enum value (cleaner than if-else)
        switch (s) {
            case Running:
                System.out.println("Running");
                break;

            case Failed:
                System.out.println("Failed All");
                break;

            case Pending:
                System.out.println("Pending All");
                break;

            case Success:
                System.out.println("Succeed All");
                break;

            default:
                System.out.println("Unknown Status");
                break;
        }

        // Printing associated price of the selected enum constant
        System.out.println("Price: " + s.getPrice());
    }
}
