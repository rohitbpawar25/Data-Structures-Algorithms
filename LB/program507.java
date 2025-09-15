import java.util.*;

class program507
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.replaceAll(" ","");

        HashMap <Character, Integer> hobj = new HashMap<Character, Integer>();

        char Arr[] = str.toCharArray();
        int Frequency = 0;

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))  // Charcter is already there in hashmap
            {
                Frequency = hobj.get(ch);
                hobj.put(ch,Frequency+1);
            }
            else    // character occured first time 
            {
                hobj.put(ch,1);
            }
        } 
        
        int iMax = 0;
        char cMax = '\0';

        for(char ch : hobj.keySet())
        {
            if(iMax < hobj.get(ch))
            {
                iMax = hobj.get(ch);
                cMax = ch;
            }
        }

        System.out.println("Maximum occured character is : "+cMax+" with frequency : "+iMax);
    }
}