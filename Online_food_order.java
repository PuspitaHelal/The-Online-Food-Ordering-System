import java.util.Scanner;

public class OnlineFoodOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Online Food Ordering!");
        System.out.println("1. Order Pizza");
        System.out.println("2. Order Burger");
        System.out.println("3. Order Pizza and Burger");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                orderPizza();
                break;
            case 2:
                orderBurger();
                break;
            case 3:
                orderPizzaAndBurger();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
    
    public static void orderPizza() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pizza Menu:");
        System.out.println("1. Margherita - $10");
        System.out.println("2. Pepperoni - $12");
        System.out.println("3. Veggie - $10");
        System.out.print("Enter your choice (1-3): ");
        
        int pizzaChoice = scanner.nextInt();
        double pizzaCost = 0;
        
        switch (pizzaChoice) {
            case 1:
                pizzaCost = 10;
                break;
            case 2:
                pizzaCost = 12;
                break;
            case 3:
                pizzaCost = 10;
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
        
        System.out.println("Your pizza order is placed!");
        System.out.println("Total cost: $" + pizzaCost);
    }
    
    public static void orderBurger() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Burger Menu:");
        System.out.println("1. Cheeseburger - $8");
        System.out.println("2. Chicken Burger - $9");
        System.out.println("3. Veggie Burger - $7");
        System.out.print("Enter your choice (1-3): ");
        
        int burgerChoice = scanner.nextInt();
        double burgerCost = 0;
        
        switch (burgerChoice) {
            case 1:
                burgerCost = 8;
                break;
            case 2:
                burgerCost = 9;
                break;
            case 3:
                burgerCost = 7;
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
        
        System.out.println("Your burger order is placed!");
        System.out.println("Total cost: $" + burgerCost);
    }
    
    public static void orderPizzaAndBurger() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pizza Menu:");
        System.out.println("1. Margherita - $10");
        System.out.println("2. Pepperoni - $12");
        System.out.println("3. Veggie - $10");
        System.out.print("Enter your pizza choice (1-3): ");
        
        int pizzaChoice = scanner.nextInt();
        double pizzaCost = 0;
        
        switch (pizzaChoice) {
            case 1:
                pizzaCost = 10;
                break;
            case 2:
                pizzaCost = 12;
                break;
            case 3:
                pizzaCost = 10;
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
               System.out.println("Burger Menu:");
        System.out.println("1. Cheeseburger - $8");
        System.out.println("2. Chicken Burger - $9");
        System.out.println("3. Veggie Burger - $7");
        System.out.print("Enter your burger choice (1-3): ");

        int burgerChoice = scanner.nextInt();
        double burgerCost = 0;

        switch (burgerChoice) {
            case 1:
                burgerCost = 8;
                break;
            case 2:
                burgerCost = 9;
                break;
            case 3:
                burgerCost = 7;
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        double totalCost = pizzaCost + burgerCost;
        System.out.println("Your order (Pizza and Burger) is placed!");
        System.out.println("Total cost: $" + totalCost);
    }
}