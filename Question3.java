// III. Difference between average of all even digits except divisible by 6 and 
// 4 and avearge of all odd digits except divisible by 3 and 5 of any digit 
// number
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number ;
        int countofeven =0;
        int countofodd =0;
        int sumofevendigits =0;
        int sumofodddigits=0;
        int difference ;
        System.out.println("Enter a number : ");
        number = sc.nextInt();
        int newnumber = number;
        for(int i = 1;newnumber>0;i ++)
        {
            int reminder = newnumber %10;
            if (reminder % 2 == 0 && reminder % 4!=0 && reminder % 6!=0) {
                sumofevendigits = sumofevendigits + reminder;
                countofeven++;
            }
            else{
                if (reminder %2 !=0 &&reminder %3 !=0 && reminder %5 != 0 ) {
                    sumofodddigits = sumofodddigits + reminder;
                    countofodd++;
                }
            }
            newnumber=newnumber / 10;
        }
        int avearageofeven = sumofevendigits / countofeven;
        int avearageofodd = sumofodddigits / countofodd;
        if (avearageofeven>avearageofodd) {
             difference = avearageofeven - avearageofodd;
        }
        else{
            difference = avearageofodd -avearageofeven;
        }
        System.out.println(difference);
    }
}
