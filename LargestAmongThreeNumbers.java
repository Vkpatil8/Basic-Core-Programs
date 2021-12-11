import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int a = sc.nextInt();
        System.out.println("Enter second value: ");
        int b = sc.nextInt();
        System.out.println("Enter third value: ");
        int c = sc.nextInt();

        //using ternary operator
        int res = a>b?(a>c?a:c):(b>c?b:c);

        System.out.println("Largest among three numbers is " + res);
    }
}
