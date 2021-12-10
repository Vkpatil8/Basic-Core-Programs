import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the power between 1-30");
        int Power = scanner.nextInt();


        if (Power > 0 && Power < 31){
            int result = 1 ;
            for (int power = 1 ; power <= Power; power++){
                result = 2 * result;
            }
            System.out.println("The Value is : " + result);
        }
        else {
            System.out.println("Plz enter power between 1-30");

        }

    }
}
