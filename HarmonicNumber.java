import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Harmonic value N ");
        int harmonicNum = scanner.nextInt();
        float result = 0;
        if (harmonicNum > 0) {
            for (int i = 1; i <= harmonicNum; i++) {
                result = result + (1 / (float) i);
            }
            System.out.println("the result is " + result);
        }
        else {
            System.out.println("Plz enter nonzero and positive value.");

        }
    }
}
