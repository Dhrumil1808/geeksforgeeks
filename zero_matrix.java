import java.util.Scanner;

/**
 * Created by dhrumil on 6/8/17.
 */
public class zero_matrix {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        boolean[] row=new boolean[arr.length];
        boolean[] col=new boolean[arr[0].length];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int k=0;k<row.length;k++)
        {
            if(row[k])
            {
                for(int l=0;l<arr.length;l++)
                {
                    arr[k][l]=0;
                }


            }
            if(row[k])
            {
                for(int l=0;l<arr.length;l++)
                {
                    arr[l][k]=0;
                }


            }

        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[i][j]);
            }
        }


    }

}
