package Graph;

import java.util.Scanner;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dhrumil on 8/31/17.
 */
public class BFS {
   private int V;
   private LinkedList<Integer> adj[];


   public BFS(int v)
   {
    V=v;
    adj=new LinkedList[v];
    for(int i=0;i<v;i++)
    {
        adj[i]=new LinkedList<Integer>();
    }
   }

   public void addEdge(int v, int w)
   {
       adj[v].add(w);
       adj[w].add(v);
   }

   public void bfs(int s)
   {
       boolean visited[] =new boolean[V];

       LinkedList<Integer> queue=new LinkedList<Integer>();
       visited[s]=true;
       queue.add(s);

       while(queue.size()!=0)
       {
           s=queue.poll();
           System.out.println(s + " ");

           Iterator<Integer> iter=adj[s].listIterator();
           while(iter.hasNext())
           {
               int n=iter.next();
               while(!visited[n])
               {
                   visited[n]=true;
                   queue.add(n);
               }
           }
       }

   }

   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       BFS b=new BFS(4);
       b.addEdge(0,1);
       b.addEdge(1,2);
       b.addEdge(0,2);
       b.addEdge(0,3);
       b.addEdge(1,3);
       b.addEdge(2,3);
       b.bfs(2);
   }


}
