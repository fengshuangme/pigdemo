package Number;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AbsolutionPosition extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public AbsolutionPosition() {
		setTitle("this a absoltionPosition");
		setLayout(null);
		setBounds(500,100,200,150);
		Container c=getContentPane();
		JButton b1=new JButton("button1");
		JButton b2=new JButton("button2");
		b1.setBounds(10,30,80,30);
		b2.setBounds(60,70,100,20);
		c.add(b1);
		c.add(b2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new AbsolutionPosition();
	}

}
