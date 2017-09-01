package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
/**
 * Created by dhrumil on 8/31/17.
 */
public class DFS {
    private int V;
    private LinkedList<Integer> adj[];

    public DFS(int v)
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


    public void bfs(int s)
    {

        boolean visit[]=new boolean[V];

        visit[s]=true;
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
                while(!visit[n])
                {
                    visit[n]=true;
                    stack.push(n);
                }
            }
        }

    }

    public static void main(String[] args)
    {
        DFS b=new DFS(5);
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
