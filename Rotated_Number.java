import java.util.Scanner;
public class Rotated_Number{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number for checking its rotation:");
        int num = scanner.nextInt();
        rotate_number(num);
    }
    public static void rotate_number(int num){
        int i = 0;
        int temp = num;
        int rotating_number = 0;
        while (temp>i){
            int sum = (temp%10);
            rotating_number = sum^3+rotating_number;
            num/=10;
        }
        System.out.println("Your rotating number is "+rotating_number);
    }
}