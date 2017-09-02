package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by dhrumil on 8/31/17.
 */
public class topological_sort {
    private int V;
    private LinkedList<Integer> adj[];

    public topological_sort(int v)
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

        public void toplogicalksort()
        {

        }
    public void topologicalsort(int s, boolean[] visited, Stack stack)
    {
        boolean visit[]=new boolean[V];
        visit[s]=true;
        Stack<Integer> stacks=new Stack<Integer>();
        //stacks.push(s);
            //int p=stack.pop();
            //System.out.println(p + " ");
            Iterator<Integer> i= adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                while(!visit[n])
                {
                    topologicalsort(s,visited,stacks);
                }
            }

        stacks.push(new Integer(s));


    }

    public static void main(String[] args)
    {
        topological_sort b=new topological_sort(5);
        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 2);
        b.addEdge(2, 0);
        b.addEdge(2, 3);
        b.addEdge(3, 3);
        b.addEdge(3,4);

        Stack stacks=new Stack();
        boolean[] visited=new boolean[5];
        b.topologicalsort(2,visited,stacks);
    }
}
