import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad02 extends JFrame {
	private JButton b1, b2, b3;
	private MyDrawer myDrawer;
	
	public Brad02(){
		// super()
		super("µøµ¡µ{¦¡");
		setLayout(new BorderLayout());
		
		b1 = new JButton("b1");
		b2 = new JButton("b2");
		b3 = new JButton("b3");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(b1);top.add(b2);top.add(b3);
		
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Brad02();
	}

}

class MyDrawer extends JPanel {
	
}


