import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Before swaping the value of a and b are " + a + " and " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping the value of a and b are " + a + " and " + b);
    }
}

