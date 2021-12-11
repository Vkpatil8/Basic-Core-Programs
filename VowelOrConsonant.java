import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet between a-z : ");
        char alphabet = scanner.next().charAt(0);
        int count = 0;

        //checking alphabet is vowel or consonant
        char[] vowel ={'a', 'e', 'i', 'o', 'u' };
        for (int i =0; i < vowel.length; i++) {
            if (vowel[i] == alphabet) {
                    count ++;
                    break;
            }
        }
        if(count==0)
            System.out.println(alphabet+ " is a Consonant");
        else
            System.out.println(alphabet+ " is a Vowel");
    }
}






