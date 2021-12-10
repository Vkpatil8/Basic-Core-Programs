import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the power between 1-30");
        int power = scanner.nextInt();


        if (power > 0 && power < 31){
            int result = 1 ;
            for (int Power = 1 ; Power <= power; Power++){
                result = 2 * result;
            }
            System.out.println("The Value is : " + result);
        }
        else {
            System.out.println("Plz enter power between 1-30");

        }

    }
}
