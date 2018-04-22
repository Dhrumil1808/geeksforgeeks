package Stack;

import java.util.Scanner;
/**
 * Created by dhrumil on 6/24/17.
 */
public class practice {

    int i=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        practice pr=new practice();
        pr.func1();

    }
    public void func1()
    {
        while(i<10) {
            i++;
            int j= i;
            System.out.println("before "+j);
            func1();
            System.out.println("after "+ j);
        }

    }

}
