
import java.util.Scanner;
public class LambtonStringTools {

    public LambtonStringTools() {
    }

    public String reverse(String s) {
        char r[] = s.toCharArray();

        for (int i = r.length - 1; i >= 0; i--) {
            System.out.print(r[i]);

        }
        return null;
    }

/*
    public void decimal(String Q) {
        int count = 0;
        String s = "lamton college 123";
        String[] split = s.split(" ");
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLetter(s[i]))
            {
                count++;

            }
        }
    }

*/


    public void convert(String Q)
    {
        Scanner in = new Scanner( System.in );

        System.out.println("Enter a binary number: ");
        String binaryString =in.nextLine();

        System.out.println("Result: "+Integer.parseInt(binaryString,2));

    }









}
