package Number;
import java.awt.Container;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyImageIcon extends JFrame{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyImageIcon() {
		Container container =getContentPane();
		JLabel jl=new JLabel("this is a JFrame window",JLabel.CENTER);	
		Icon icon=new ImageIcon();
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);
		container.add(jl);
	    setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new MyImageIcon();
	}
}
