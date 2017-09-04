package Graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dhrumil on 9/4/17.
 */
public class cyclic_directed_recur {


        private int V;
        private LinkedList<Integer> adj[];

        public cyclic_directed_recur(int v)
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

        public boolean DFSUtil(int v, boolean[] visited,boolean bool)

        {

            visited[v]=true;


            // System.out.println(v + " ");

            Iterator<Integer> iter=adj[v].listIterator();
            while(iter.hasNext())
            {
                int n = iter.next();
                if(!visited[n])
                {
                    // visited[n]=true;
                    return DFSUtil(n,visited,false);
                }
                if(visited[n])
                {
                    return true;
                }
            }

            return false;

        }

        public void DFS(int v)
        {
            boolean[] visited=new boolean[V];
            boolean result=DFSUtil(v,visited,false);
            if(result)
                System.out.println("graph has a cycle");
            else
                System.out.println("graph does not have a cycle");
        }

        public static void main(String[] args)
        {

            int i=0;
            Graph.DFS_recur b=new Graph.DFS_recur(4);
            b.addEdge(0, 1);
            b.addEdge(0, 2);
            b.addEdge(3, 2);
            b.addEdge(2, 0);
            b.addEdge(1, 3);
            b.addEdge(3, 3);
            b.DFS(0);



        }


    }





