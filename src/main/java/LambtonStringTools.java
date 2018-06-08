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


    public String decimal(String Q)
    {


        {
            int count;
            String s = "lamton college";
            String[] split = s.split(" ");
            for(String str: split)
            {
                char[] ch = str.toCharArray();   // convert string to char array
                count = 0;                       // reset count for every new word/string
                for(char c: ch)                  // iterate over all the characters
                {
                    if(Character.isLetter(c))    // Returns true if the character is a Letter
                    {
                        count++;                 // increase the count to represent no. of letters
                    }
                }
                System.out.print(count + " ");
                System.out.print(ch + " ");// print the no.of characters that are letters in a word/string.
            }
        }

        return null;
    }
}
