package com.assignments.datastuctures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class WeightedGraph {
	static class Edge implements Comparable<Edge> {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.weight-o.weight;
		}

		@Override
		public String toString() {
			return "Edge [source=" + source + ", destination=" + destination + ", weight=" + weight + "]";
		}
		
    }
	static class Graph{
		int vertices;
        LinkedList<Edge> [] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }
        public void addEgde(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge); //for directed graph
        }
        public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex-" + (char)(i+65) + " is connected to " +
                            (char)(list.get(j).destination+65) + " with weight " +  list.get(j).weight);
                }
            }
        }
	}
	public static void main(String args[]) {
		int vertices = 6;
		Graph graph = new Graph(vertices);
		graph.addEgde(0, 1, 2);
		graph.addEgde(0, 3, 8);
		graph.addEgde(1, 0, 2);
        graph.addEgde(1, 3, 5);
        graph.addEgde(1, 4, 6);
        graph.addEgde(2, 4, 9);
        graph.addEgde(2, 5, 3);
        graph.addEgde(3, 0, 8);
        graph.addEgde(3, 1, 5);
        graph.addEgde(3, 4, 3);
        graph.addEgde(3, 5, 2);
        graph.addEgde(4, 1, 6);
        graph.addEgde(4, 2, 9);
        graph.addEgde(4, 3, 3);
        graph.addEgde(4, 5, 1);
        graph.addEgde(5, 2, 3);
        graph.addEgde(5, 3, 2);
        graph.addEgde(5, 4, 1);
        
        graph.printGraph();
        djikstraAlgorithm(graph,vertices);
	}
	
	public static void djikstraAlgorithm(Graph graph,int vertices) {
		PriorityQueue<Edge>pq=new PriorityQueue<>();
		pq.add(new Edge(0,0,0));
		int dist[]=new int[vertices];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0]=0;
		
		while(!pq.isEmpty()) {
			Edge temp=pq.remove();
			for(Edge e: graph.adjacencylist[temp.destination]) {
				if(e.weight+dist[temp.destination]<dist[e.destination]) {
					dist[e.destination]=e.weight+dist[temp.destination];
					pq.add(e);
				}
			}
		}
		System.out.println("---------------");
		for(int i=0;i<dist.length;i++) {
			System.out.println((char)(65)+" to "+(char)(i+65)+" "+dist[i]);
		}
		
	}
	
}
