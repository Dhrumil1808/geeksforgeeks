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
        StringBuilder builder=new StringBuilder();
 
        builder.append(input);

        builder=builder.reverse();
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<builder.length; i++)
           System.out.print(builder.charAt(i));
 
        
    }
}