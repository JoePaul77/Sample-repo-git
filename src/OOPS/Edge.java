package OOPS;

import java.util.*;

//public class Edge implements Comparable<Edge> {
//    int fromNode;
//    int toNode;
//
//    // CONSTRUCTOR — just assign the fields
//    public Edge(int fromNode, int toNode) {
//        this.fromNode = fromNode;
//        this.toNode = toNode;
//    }
//
//    // FACTORY METHOD — just calls new Edge
//    public static Edge createEdge(int fromNode, int toNode) {
//        return new Edge(fromNode, toNode);
//    }
//
//    // HASHCODE — combine both fields into one number
//    @Override
//    public int hashCode() {
//        return Objects.hash(fromNode, toNode);
//    }
//
//    // EQUALS — same fromNode AND same toNode = equal
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Edge  )) return false;
//        Edge other = (Edge) o;
//        return this.fromNode == other.fromNode && this.toNode == other.toNode;
//    }
//
//    // COMPARETO — sort by fromNode ASC, then toNode DESC
//    @Override
//    public int compareTo(Edge other) {
//        if (this.fromNode != other.fromNode) {
//            return this.fromNode - other.fromNode;   // ascending
//        }
//        return other.toNode - this.toNode;           // descending
//    }
//
//    // TOSTRING — exact format the exam expects
//    @Override
//    public String toString() {
//        return "From node: " + fromNode + " To node: " + toNode;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        Set<Edge> edgeSet = new TreeSet<>();  // TreeSet = unique + sorted
//
//        for (int i = 0; i < n; i++) {
//            int from = sc.nextInt();
//            int to = sc.nextInt();
//            edgeSet.add(Edge.createEdge(from, to));  // duplicates auto-removed
//        }
//
//        System.out.println(edgeSet.size());  // unique count
//        for (Edge e : edgeSet) {
//            System.out.println(e);           // calls toString() automatically
//        }
//    }
//}



public class Edge implements Comparable<Edge> { 
	 
    int fromNode; 
    int toNode; 
 
    // Constructor 
    public Edge(int fromNode, int toNode) { 
        this.fromNode=fromNode;
        this.toNode=toNode;
    } 
 
    // Factory method 
    public static Edge createEdge(int fromNode, int toNode) { 
     return new Edge(fromNode,toNode);
       
    } 
 
    @Override 
    public int hashCode() { 
        return Objects.hash(fromNode,toNode);
         
    } 
 
    @Override 
    public boolean equals(Object o) { 
        if(this==o) 
        {
        	return true;
        }
        if(!(o instanceof Edge)) 
        {
        	return false;
        }
        
        Edge other=(Edge) o;
        
        return this.fromNode==other.fromNode && this.toNode==other.toNode ;
         
    } 
 
    // compareTo method is NOT given in the boilerplate 
    @Override 
    public int compareTo(Edge other) { 
        if(this.fromNode != other.fromNode) 
        {
        	return this.fromNode-other.fromNode;
        }
        return other.toNode-this.toNode;
         
    } 
 
    @Override 
    public String toString() { 
        return "Node: "+fromNode+"To Node: "+toNode;
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Edge> edgeSet = new TreeSet<>();  // TreeSet = unique + sorted

        for (int i = 0; i < n; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            edgeSet.add(Edge.createEdge(from, to));  // duplicates auto-removed
        }

        System.out.println(edgeSet.size());  // unique count
        for (Edge e : edgeSet) {
            System.out.println(e);           // calls toString() automatically
        }
    }
   
}













