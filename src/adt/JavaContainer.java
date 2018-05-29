/**
 * Java Container Data Structure Example
 * shows Container data structures.
 * 
 * A container is a class, a data structure, or an abstract data type (ADT) 
 * whose instances are collections of other objects. They store objects in an 
 * organized way that follows specific access rules. The size of the container 
 * depends on the number of objects (elements) it contains. Underlying 
 * (inherited) implementations of various container types may vary in size and 
 * complexity, and provide flexibility in choosing the right implementation for 
 * any given scenario.
 * 
 * In Java, the server and containers are as follows:
 *   - Java EE server: The runtime portion of a Java EE product. A Java EE 
 *                     server provides EJB and web containers.
 *   - EJB container: Manages the execution of enterprise beans for Java EE 
 *                    applications. Enterprise beans and their container run 
 *                    on the Java EE server.
 *   - Web container: Manages the execution of web pages, servlets, and some 
 *                    EJB components for Java EE applications. Web components 
 *                    and their container run on the Java EE server.
 *   - Application client container: Manages the execution of application client
 *                                   components. Application clients and their 
 *                                   container run on the client.
 *   - Applet container: Manages the execution of applets. Consists of a web 
 *                       browser and a Java Plug-in running on the client 
 *                       together.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class JavaContainer {
 public static void main(String[] args) {
  // Create a frame
  Frame frame = new Frame("Example Frame");
  Panel panel = new Panel();

  // Add several buttons to the container
  panel.add(new Button("Button_A"));
  panel.add(new Button("Button_B"));
  panel.add(new Button("Button_C"));

  // Add a text area in the center of the frame
  Component textArea = new TextArea("Sample text");
  frame.add(textArea, BorderLayout.CENTER);

  // Add the container to the bottom of the frame
  frame.add(panel, BorderLayout.SOUTH);

  // Display the frame
  int frameWidth = 300;
  int frameHeight = 300;
  frame.setSize(frameWidth, frameHeight);
  frame.setVisible(true);
 }
}      

