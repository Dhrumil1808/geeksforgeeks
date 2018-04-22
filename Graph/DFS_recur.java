package Graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dhrumil on 8/31/17.
 */
 public class DFS_recur {

     private int V;
     private LinkedList<Integer> adj[];

     public DFS_recur(int v)
     {
         V=v;
         adj=new LinkedList[V];
         for(int i=0;i<V;i++)
         {
             adj[i]=new LinkedList<Integer>();
         }

     }


     public void addEdge(int v,int w)
     {
         adj[v].add(w);
     }

     public void DFSUtil(int v, boolean[] visited,boolean bool)

     {
        //LinkedList<Integer> queue=new LinkedList<Integer>();

         if(visited[v]) {
             bool = true;
            // System.out.println("Graph has cycle");
         }
        visited[v]=true;
        //queue.add(v);


            System.out.println(v + " ");

            Iterator<Integer> iter=adj[v].listIterator();
            while(iter.hasNext())
            {
                int n = iter.next();
                if(!visited[n])
                {
                  // visited[n]=true;
                    DFSUtil(n,visited,false);
                }
            }


     }

     public void DFS(int v)
     {
         boolean[] visited=new boolean[V];
         DFSUtil(v,visited,false);
     }

        public static void main(String[] args)
        {
            DFS_recur b=new DFS_recur(5);
            b.addEdge(0, 1);
            b.addEdge(0, 2);
            b.addEdge(1, 2);
            b.addEdge(2, 0);
            b.addEdge(2, 3);
            b.addEdge(3, 3);
            b.addEdge(3,4);

            boolean[] visited=new boolean[5];
            b.DFS(2);
        }


    }


