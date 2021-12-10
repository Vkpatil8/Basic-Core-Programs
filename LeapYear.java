import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the four digit year you want to check  ");
        int year = scanner.nextInt();
        if (year <= 9999 && year >999){
            if (year % 4 == 0){
                System.out.println( year + " is leap year");
            }
            else{
                System.out.println( year + " is not a leap year");
            }
        }
        else {
            System.out.println("This is for only Four digit years so plz Enter Four digit year");
        }
    }

}
