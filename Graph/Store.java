package Graph;

import java.util.ArrayList;
// this is my mind approch so this is not use i.
public class Store {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void creategraphwithLOL(){

        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(3);
        
        ArrayList<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(1);
        c.add(3);

        ArrayList<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(2);
        
        graph.add(a);
        graph.add(b);
        graph.add(c);
        graph.add(d);
        
        for(int i=0; i<graph.size(); i++){
            System.out.print(i+" -> ");
            for(int j=0; j<graph.get(i).size(); j++){
                System.out.print(graph.get(i).get(j)+" -> ");
            }
            System.out.println();
        }
    }
    public static void creategraphwithAOL(){

    }
    public static void main(String[] args) {
        //List of List
        creategraphwithLOL();
        //Array Of List
        creategraphwithAOL();
    }
}
