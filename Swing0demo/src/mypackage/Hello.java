package mypackage;

//Hello.java (Java SE 5)
import javax.swing.*;

public class Hello extends JFrame {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Hello() {
     super("hello");
     this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     this.add(new JLabel("Hello, world!"));
     this.pack();
     this.setVisible(true);
 }

 public static void main(final String[] args) {
     new Hello();
 }
}