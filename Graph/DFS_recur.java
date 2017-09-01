package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by dhrumil on 8/31/17.
 */
 public class DFS_recur {
        private int V;
        private LinkedList<Integer> adj[];

        public DFS_recur(int v)
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
        }


        public void bfs(int s,boolean[] visited)
        {


            visited[s]=true;
            Stack<Integer> stack=new Stack<Integer>();
            stack.push(s);

            while(stack.size()!=0)
            {
                int p=stack.pop();
                System.out.println(p + " ");
                Iterator<Integer> i= adj[p].listIterator();
                while(i.hasNext())
                {
                    int n=i.next();
                    while(!visited[n])
                    {

                        bfs(s,visited);
                    }
                }
            }

        }

        public static void main(String[] args)
        {
            Graph.DFS b=new Graph.DFS(5);
            b.addEdge(0, 1);
            b.addEdge(0, 2);
            b.addEdge(1, 2);
            b.addEdge(2, 0);
            b.addEdge(2, 3);
            b.addEdge(3, 3);
            b.addEdge(3,4);
            b.bfs(2);
        }


    }


