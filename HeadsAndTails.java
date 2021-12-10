import java.util.Scanner;

public class HeadsAndTails {
    public static void main(String[] args) {
        int Head = 0;
        int Tail = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times you want to clip the coin.");
        int NumberOfTime = scanner.nextInt();

        if (NumberOfTime > 0) {
            int flip = 0;
            while (flip < NumberOfTime) {
                float value = (float) Math.random();
                if (value < 0.5) {
                    Head++;
                } else {
                    Tail++;
                }
                flip++;
            }

            float head_per = ( (float) Head / Tail )*100;
            System.out.println("The Head fell " + Head + " times and The Tail fell " + Tail + " times.");
            System.out.println("The Percentage of Head vs Tail is " + head_per + " %");
        } else {
            System.out.println("Plz Enter positive value");
        }
    }
}
