import java.util.Scanner;
public class Calculator{
    public static void add(int num1, int num2){
        System.out.println("Addition:"+(num1+num2));
    }
    public static void subtract(int num1, int num2){
        System.out.println("Subtraction:"+ (num1-num2));
    }
    public static void multiply(int num1, int num2){
        System.out.println("Multiplication:"+(num1*num2));
    }
    public static void divide(int num1, int num2){
        System.out.println("Division:"+(num1/num2));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        System.out.println("Enter your first numer:");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number:");
        int num2 = scanner.nextInt();
        if (choice == 1){
            add(num1,num2);
        } else if (choice == 2){
            subtract(num1,num2);
        } else if (choice == 3){
            multiply(num1,num2);
        } else if (choice == 4){
            divide(num1,num2);
        }else{
            System.out.println("Enter your correct choice:");
        }
        String input = scanner.nextLine();
        if (input.equals("Y") || input.equals("y")){
            System.out.println("Restart the program.");
        }else{
            System.out.println("Bye.");
        }
    }
}