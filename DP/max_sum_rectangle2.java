package DP;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dhrumil on 6/20/17.
 */
public class max_sum_rectangle2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        findsubmatrix(matrix);

    }


    public static void findsubmatrix(int[][] m)
    {
        int[] table=new int[10];
        int[] tables=new int[10];
        int rows=m.length;
        int cols=m[0].length;
        int max=0;
        int left=0;
        int right=0;
        int top=0;
        int bottom=0;
        int area=0;
       // boolean flag=false;

        for(int leftcols=0;leftcols < cols;leftcols++)
        {
            String[] tmp=new String[rows];
            String[] tmp1=new String[rows];
            String[] tmp2=new String[rows];
            //String[] tmps=new String[rows];
            for(int i=0;i<rows;i++) {
                tmp[i] = "";
                tmp1[i] = "";
                tmp2[i] = "";
            }
            for(int rightcols=leftcols; rightcols< cols; rightcols++)
            {


                for(int row=0;row<rows;row++) {
                for (int r = row; r < rows; r++) {

                        tmp[r] = String.valueOf(m[r][rightcols]);
                        table[Integer.parseInt(tmp[r])] = table[Integer.parseInt(tmp[r])] + 1;
                    System.out.println(tmp[r]);
                      //  System.out.println(table[Integer.parseInt(tmp[r])]);
                        int k = 0;
                        for (int i = 0; i < table.length; i++) {
                            if (table[i] % 2 != 0) {
                                k++;
                            }
                        }

                        if (k <= 1) {
                            // System.out.println(java.util.Arrays.toString(table));
                            System.out.println("leftcols " + leftcols);
                            System.out.println("rightcols " + rightcols);
                            System.out.println("toprow " + row );
                            System.out.println("bottomrow "+ r);
                            area = (((r) - row) + 1) * ((rightcols - leftcols) + 1);
                            System.out.println(max);
                            if (max < area) {
                                max = area;
                                left = leftcols;
                                right = rightcols;
                                top = row;
                                bottom = r;
                            }
                            // flag=false;


                        } else {

                        }
                    }
                }
                //System.out.println("----------");
                Arrays.fill(table,0);
          }
        }


        System.out.println(max);
        System.out.println(left + " " + top + " " + bottom + " "+ right);
    }
}
