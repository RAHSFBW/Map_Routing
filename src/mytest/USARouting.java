import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.DijkstraUndirectedSP;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class USARouting {
    public static void main(String[] args) {
        In in = new In("usa.txt");
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
        int s = Integer.parseInt("0");

        // compute shortest paths
       DijkstraUndirectedSP sp = new DijkstraUndirectedSP(G,s);


        // print shortest path
        for (int t = 0; t < G.V(); t++) {
            if (sp.hasPathTo(t)) {
                StdOut.printf("%d to %d (%.2f)  ", s, t, sp.distTo(t));
                for (Edge e : sp.pathTo(t)) {
                    StdOut.print(e + "   ");
                }
                StdOut.println();
            }
            else {
                StdOut.printf("%d to %d         no path\n", s, t);
            }
        }
    }
}
