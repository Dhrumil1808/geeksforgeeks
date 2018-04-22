import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer,ArrayList<Integer>> hash=new HashMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> removes=new ArrayList<Integer>();
        for(int a0 = 0; a0 < k; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            if(hash.containsKey(x))
            {
                int j=0;
                if(hash.get(x).contains(y))
                {
                    j++;
                    for(int i=0;i<hash.get(y).size();i++)
                    {
                        if(hash.get(x).contains(hash.get(y).get(i)))
                        {

                        }
                        else
                        {
                            hash.get(x).add(hash.get(y).get(i));
                        }
                    }
                }
                if(j==0)
                    hash.get(x).add(y);
            }
            else if(hash.containsKey(y))
            {
                int j=0;
                //System.out.println(hash.get(x).size());
                for(int i=0;i<hash.get(y).size();i++)
                {
                    if(x==hash.get(y).get(i))
                    {
                        j++;
                    }

                }
                if(j==0)
                    hash.get(y).add(x);
            }

            else
            {
                ArrayList<Integer> arr=new ArrayList<Integer>();
                arr.add(y);
                hash.put(x,arr);
                ArrayList<Integer> arr1=new ArrayList<Integer>();
                arr1.add(x);
                hash.put(y,arr1);
            }
        }
        int[] a = new int[m];
        for(int a_i=0; a_i < m; a_i++){
            a[a_i] = in.nextInt();

        }
        ///int k=0;
        int j=a.length-1;
        for(int i=0;i<a.length/2;i++)
        {
            if(a[i]==a[j])
            {
                j--;
                //     k++;
            }
            else if(hash.containsKey(a[i]))
            {
                int dup=0;
                for(int l=0;l<hash.get(a[i]).size();l++)
                {
                    if(hash.get(a[i]).get(l) == a[j] )
                    {
                        dup++;
                        a[j]=a[i];
                        //removes.add(i);
                        j--;
                    }
                }
                if(dup==0 && i!=j)
                {
                    System.out.println(i);
                    removes.add(i);
                }
            }
            else if(hash.containsKey(a[j]))
            {
                int dup=0;
                for(int l=0;l<hash.get(a[j]).size();l++)
                {
                    if(hash.get(a[j]).get(l) == a[i] )
                    {
                        dup++;
                        a[j]=a[i];
                        j--;
                    }
                }

            }

            else
            {
                removes.add(i);
                if(i!=j)
                    removes.add(j);
                j--;
            }
        }

        int diff= m - removes.size();
        //System.out.println(removes.size());
        System.out.println(diff);




    }
}

