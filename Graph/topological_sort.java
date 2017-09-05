package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by dhrumil on 8/31/17.
 */
public class topological_sort
{
    private int V;
    private LinkedList<Integer> adj[];

    public topological_sort(int v)
    {
    V=v;
    adj=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }




    }

    public void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    public void topology()
    {
    Stack s=new Stack();
    boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                //visited[i]=true;
                //s.push(v);
                topological(i,visited,s);
            }
        }

        while(s.empty()==false)
            System.out.println(s.pop() + " ");
    }

    public void topological(int v, boolean[] visited, Stack s)
    {
        visited[v]=true;
        Integer i;
        Iterator<Integer> iter= adj[v].iterator();
        while(iter.hasNext())
        {
            i=iter.next();
            if(!visited[i])
            {
                topological(i,visited,s);
            }
        }

        s.push(v);

    }

    public static void main(String[] args)
    {
        topological_sort g = new topological_sort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        g.topology();
    }
}
