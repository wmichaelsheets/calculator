import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);
    
    private static String getString(String prompt){
        System.out.print(prompt);
        return inputScanner.next();
     }

    private static double getDouble(String prompt) {
        System.out.print(prompt);
        return inputScanner.nextDouble();
    }
    public static void main(String[] args) {
        String choice = getString("What would you like to do: add, subtract, multiply, divide, exit?");
        double num1 = getDouble("Enter your first number ");
        double num2 = getDouble("Enter your second number ");
        
        System.out.printf("You want to %s %f and %f %n", choice,num1, num2);

        switch (choice) {
            case "add":
                {double result = Calculator.add(num1, num2);
                System.out.println("Your result is:" + result);}
                break;
            case "subtract":
                {double result = Calculator.subtract(num1, num2);
                System.out.println("Your result is:" + result);}
                break;
            case "multiply":
                {double result = Calculator.multiply(num1, num2);
                System.out.println("Your result is:" + result);}
                break;
            case "divide":
                {double result = Calculator.divide(num1, num2);
                System.out.println("Your result is:" + result);}
                break;
            default:
                System.out.println("Goodbye!");
                System.exit(0);
                }
            
                String continuePrompt = getString("Do you want to continue? (y/n) ");

    
    if (continuePrompt.equalsIgnoreCase("y")) {
      double newNum1 = getDouble("Enter your first number: ");
      double newNum2 = getDouble("Enter your second number: ");

      newNum1 = num1;
      newNum2 = num2;

      


    } else {
        
        System.out.println("Goodbye!");
        System.exit(0);
      }
    }
        }
   
    

        
        


    

