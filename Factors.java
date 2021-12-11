import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find the prime factors");
        int primeFactors = scanner.nextInt();
        for (int i = 2; i < primeFactors; i++) {
            if ( primeFactors % i == 0){
                System.out.println("factors is :" + i);
                primeFactors /= i;
            }
            else{
                System.out.println("This value cannot factorise");
                break;
            }
        }
    }
}
