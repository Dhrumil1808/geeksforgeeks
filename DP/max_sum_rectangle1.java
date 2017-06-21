package DP;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by dhrumil on 6/19/17.
 */
public class max_sum_rectangle1 {

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
        int [] currentresult;
        int max=0;
        int left=0;
        int right=0;
        int top=0;
        int bottom=0;
        boolean flag=false;

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


                for (int r = 0; r < rows; r++) {
                    tmp[r] += m[r][rightcols] +",";
                    // System.out.println(tmp[r]);
                    String[] parts=tmp[r].split(",");
                    for(int l=0;l<parts.length;l++)
                    {
                        //System.out.println(Integer.parseInt(parts[l]));
                        table[Integer.parseInt(parts[l])] =  table[Integer.parseInt(parts[l])] + 1;

                    }
                    int k=0;
                    for(int i=0;i<table.length;i++)
                    {
                        if(table[i]%2!=0)
                        {
                            k++;
                        }
                    }

                    if(k<=1)
                    {
                        // System.out.println(java.util.Arrays.toString(table));
                        // System.out.println("toprows " + toprows);
                        // System.out.println("bottomrows " + bottomrows);
                        int area = (( (r)-0) + 1 ) * (( rightcols-leftcols) + 1);
                        //System.out.println(max);
                        if(max< area) {
                            max = area;
                            left=leftcols;
                            right=rightcols;
                            top=0;
                            bottom=r;
                        }
                        flag=false;


                    }
                    else
                    {
                        // System.out.println(java.util.Arrays.toString(table));
                        //System.out.println("leftcols " + leftcols);
                        //System.out.println("rightcols " + rightcols);

                    }
                }


                //System.out.println("----------");


                Arrays.fill(table,0);

            }
        }

        for(int toprows=0;toprows < rows;toprows++)
        {
            String[] tmp=new String[cols];
            String[] tmp1=new String[cols];
            String[] tmp2=new String[cols];
            //String[] tmps=new String[rows];
            for(int i=0;i<cols;i++) {
                tmp[i] = "";
                tmp1[i] = "";
                tmp2[i] = "";
            }

            for(int bottomrows=toprows; bottomrows< rows; bottomrows++)
            {



                for (int r = 0; r < cols; r++) {
                    tmp[r] += m[bottomrows][r] +",";
                    // System.out.println(tmp[i]);
                    String[] parts=tmp[r].split(",");
                    for(int l=0;l<parts.length;l++)
                    {
                        //System.out.println(Integer.parseInt(parts[l]));
                        table[Integer.parseInt(parts[l])] =  table[Integer.parseInt(parts[l])] + 1;

                    }
                    int k=0;
                    for(int i=0;i<table.length;i++)
                    {
                        if(table[i]%2!=0)
                        {
                            k++;
                        }
                    }

                    if(k<=1)
                    {
                        // System.out.println(java.util.Arrays.toString(table));
                        // System.out.println("toprows " + toprows);
                        // System.out.println("bottomrows " + bottomrows);
                        int area = (( (r)-0) + 1 ) * (( bottomrows-toprows) + 1);
                        //System.out.println("max= " + max);
                        if(max< area) {
                            max = area;
                            left=0;
                            right=r;
                            top=toprows;
                            bottom=bottomrows;
                        }
                        flag=false;


                    }
                    else
                    {
                        // System.out.println(java.util.Arrays.toString(table));
                        //System.out.println("toprows " + toprows);
                        //System.out.println("bottomrows " + bottomrows);

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

