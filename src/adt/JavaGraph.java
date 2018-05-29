/**
 * Java Graph Data Structure Example
 * shows graph data structures.
 * 
 * A graph is an abstract data type that is meant to implement the undirected 
 * graph and directed graph concepts from mathematics, specifically the field 
 * of graph theory. A graph consists of a finite (and possibly mutable) set of 
 * vertices or nodes or points, together with a set of unordered pairs of these 
 * vertices for an undirected graph or a set of ordered pairs for a directed 
 * graph. These pairs are known as edges, arcs, or lines for an undirected 
 * graph and as arrows, directed edges, directed arcs, or directed lines for a 
 * directed graph. The vertices may be part of the graph structure, or may be 
 * external entities represented by integer indices or references.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;
 
public abstract class JavaGraph {
 private int numVertices;
 private int numEdges;
 
 public JavaGraph() {
  numVertices = 0;
  numEdges = 0;
 }
 
 public int getNumVertices() {
  return numVertices;
 }
 
 public int getNumEdges() {
  return numEdges;
 }
  
 public void setNumVertices(int v) {
  numVertices = v;
 }

 public void setNumEdges(int e) {
  numEdges = e;
 }

 public abstract boolean inEdgeExists(int v, int w) 
         throws VertexOutOfBoundsException;

 public abstract boolean outEdgeExists(int v, int w) 
         throws VertexOutOfBoundsException;

 public abstract void addVertex();

 public abstract void addEdge(int v, int w) 
         throws VertexOutOfBoundsException;

 public abstract void removeVertex() 
         throws VertexOutOfBoundsException;

 public abstract void removeEdge(int v, int w) 
         throws VertexOutOfBoundsException;

 public abstract int getInDegree(int v) 
         throws VertexOutOfBoundsException;

 public abstract int getOutDegree(int v) 
         throws VertexOutOfBoundsException;

 public abstract List getNeighbors(int v) 
         throws VertexOutOfBoundsException;

 public abstract List getNeighborsTwoApart(int v) 
         throws VertexOutOfBoundsException;

 public List getDegreeSeq() 
         throws VertexOutOfBoundsException {
  List degreeSeq = new ArrayList();
  
  int degrees = 0;
  
  for (int i = 0; i < getNumVertices(); i++) {
   degrees = getInDegree(i) + getOutDegree(i);
   degreeSeq.add(degrees);
  }
  
  Collections.sort(degreeSeq);
  Collections.reverse(degreeSeq);
   return degreeSeq;
 } 
 public static void main(String[] args) {}

    private static class VertexOutOfBoundsException extends Exception {

        public VertexOutOfBoundsException() {
        }
    }
}


              