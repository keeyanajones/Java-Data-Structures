/**
 * Java Tree Data Structure Example
 * shows Tree data structures.
 * 
 * A tree is a widely used abstract data type (ADT)—or data structure 
 * implementing this ADT—that simulates a hierarchical tree structure, 
 * with a root value and subtrees of children with a parent node, represented 
 * as a set of linked nodes. A tree can be defined recursively (locally) as a
 * collection of nodes (starting at a root node), where each node is a data 
 * structure consisting of a value, together with a list of references to 
 * nodes (the "children"), with the constraints that no reference is 
 * duplicated, and none points to the root.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;
                
public class JavaTree {
 public static void main(String[] args) {
  JavaNode root = createTree();
  printTree(root, " ");
 }

 private static JavaNode createTree() {
  JavaNode root = new JavaNode<>("root");

  JavaNode node1 = root.addChild(new JavaNode("node 1"));

  JavaNode node11 = node1.addChild(new JavaNode("node 11"));
  JavaNode node111 = node11.addChild(new JavaNode("node 111"));
  JavaNode node112 = node11.addChild(new JavaNode("node 112"));

  JavaNode node12 = node1.addChild(new JavaNode("node 12"));

  JavaNode node2 = root.addChild(new JavaNode("node 2"));

  JavaNode node21 = node2.addChild(new JavaNode("node 21"));
  JavaNode node211 = node2.addChild(new JavaNode("node 22"));
   return root;
 }

 private static  void printTree(JavaNode node, 
                                  String appender) {
  System.out.println(appender + node.getData());
  node.getChildren().forEach(each ->  
          printTree(each, appender + appender));
 }
}
