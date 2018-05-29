/**
 * Java Node Data Structure Example
 * shows node data structures.
 * 
 * The Node interface is the primary datatype for the entire Document Object 
 * Model. It represents a single node in the document tree. While all objects 
 * implementing the Node interface expose methods for dealing with children, 
 * not all objects implementing the Node interface may have children. 
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;

public class JavaNode {
 private JavaTree data = null;
 private List> children = new ArrayList<>();
 private JavaNode parent = null;
 
 public JavaNode(JavaTree data) {
  this.data = data;
 }
 
 public JavaNode addChild(JavaNode child) {
  child.setParent(this);
  this.children.add(child);
  return child;
 }
 
 public void addChildren(List> children) {
  children.forEach(each -> each.setParent(this));
  this.children.addAll(children);
 }

 public List> getChildren() {
  return children;
 }

 public JavaTree getData() {
  return data;
 }

 public void setData(JavaTree data) {
  this.data = data;
 }

 private void setParent(JavaNode parent) {
  this.parent = parent;
 }

 public JavaNode getParent() {
  return parent;
 }
}        

