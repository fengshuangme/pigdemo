package Number;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyJDialog extends JDialog{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public MyJDialog(MyFrame frame) {
			super (frame,"the first JDialog window",true);
			Container container=getContentPane();
			container.add(new JLabel("this is a chat Dialog"));
			setBounds(100,120,100,100);
			setSize(200,200);
		}
		
}
 public class MyFrame extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String [] args) {
			new MyFrame();
		}		
   public MyFrame() {
	    	Container container=getContentPane();
			container.setLayout(null);
			JLabel jl=new JLabel("this is a JFrame window");
			jl.setHorizontalAlignment(SwingConstants.CENTER);
			container.add(jl);
			JButton bl=new JButton("Popup dialogs");
			bl.setBounds(50, 50, 100, 21);
			bl.addActionListener(new ActionListener() {		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new MyJDialog(MyFrame.this).setVisible(true);
				}
			});
			container.add(bl);	
			setVisible(true);
			setSize(500, 300);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        	
		}	
       
}

	


	



