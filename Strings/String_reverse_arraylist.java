import java.lang.*;
import java.io.*;
import java.util.*;
 
// Class of ReverseString
class ReverseString
{
    public static void main(String[] args)
    {
        String input = "GeeksforGeeks";
 
        // getBytes() method to convert string 
        // into bytes[].
        ArrayList<String> strings=new ArrayList<String>();
       
        char[] hello=input.toCharArray();
 
    for (char c:hello)
        strings.add(c);

    Collections.reverse(strings);
    ListIterator li=strings.ListIterator();
    while(li.hasNext())
        System.out.println(li.next());
        
        
    }
}