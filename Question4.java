// IV. Find kth digit from front side or back side of any digits number and find
// its positional value

import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = sc.nextInt();

        System.out.print("Enter the value of k: ");
        int positionOfTheValue = 0;
        int k = sc.nextInt();

        System.out.print("Find from front (1) or back (2): ");
        int choice = sc.nextInt();

        int newnumber = number;
        int numOfDigits = 0;
        for (int i = 1; newnumber != 0; i++) {
            newnumber = newnumber / 10;
            numOfDigits++;
        }
        int[] digits = new int[numOfDigits];
        newnumber = number;

        if (k > numOfDigits || k <= 0) {
            System.out.println("Invalid the kth term .... ");

        } else {
            for (int i = numOfDigits - 1; newnumber > 0; i--) {
                digits[i] = newnumber % 10;
                newnumber = newnumber / 10;

            }
        }
        if (choice == 1) {
            int digit = digits[k - 1];
            positionOfTheValue = digit * (int) Math.pow(10, numOfDigits - k);
            // positionalValue = digit * (int) Math.pow(10, numOfDigits - k);
        }
        else if (choice ==2) {
            int digit = digits[numOfDigits - k];
            positionOfTheValue = digit * (int) Math.pow(10, k - 1);
        }
        else
        {
            System.out.println("Invalid choise please re enter ...");
        }
        System.out.println(positionOfTheValue);

    }
}