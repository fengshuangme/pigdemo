package Number;
import java.awt.*;
import javax.swing.*;
public class Swing_test extends JFrame {
        	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			public void CreateJFrame(String title) {
        		JFrame jf =new JFrame(title);
            	Container container=jf.getContentPane();
            	JLabel jl=new JLabel("this is a JFrame window");
            	jl.setHorizontalAlignment(SwingConstants.CENTER);
            	container.add(jl);
            	container.setBackground(Color.white);
            	jf.setVisible(true);
            	jf.setSize(1000, 700);
            	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        	}	       	
        public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		new Swing_test().CreateJFrame("Create a JFrame window");       
    	}
}
