
// II. Verify whether difference between Summation of all even digits and 
// odd digits of and prime digits is equal to half of sum of all digits of any 
// number
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumofevendigits = 0;
        int sumofodddigits = 0;
        int difference;
        System.out.println("Enter a number : ");

        int number = sc.nextInt();
        int newnumber = number;

        for (int i = 1; newnumber > 0; i++) {
            int reminder = newnumber % 10;
            if (reminder % 2 == 0) {
                sumofevendigits = sumofevendigits + reminder;
            } else {
                sumofodddigits = sumofodddigits + reminder;
            }
            newnumber = newnumber / 10;
        }
        if (sumofevendigits>sumofodddigits) {
             difference = sumofevendigits - sumofodddigits;
        }
        else{
            difference = sumofodddigits - sumofevendigits;
        }
        System.out.println(difference);
    }
}
