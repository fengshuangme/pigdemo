package eighteenth;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingAndThread extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jl=new JLabel();
	private static Thread t;
	private int count =0;
	private  Container container=getContentPane();
	public SwingAndThread() {
		setBounds(10,10,500,500);
		container.setLayout(null);
		URL url=SwingAndThread.class.getResource("Capture.JPG");
		Icon icon=new ImageIcon(url);
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		jl.setBounds(10,10,100,10);
		jl.setOpaque(true);
		t=new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(count<=200) {
					jl.setBounds(count, 10, 100, 70);
					try {
						Thread.sleep(100);
						
					}catch(Exception e){
						e.printStackTrace();
					}
					count+=4;
					if(count>200) {
						count=10;
						}
				}				
			}
		});
		t.start();
		container.add(jl);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingAndThread();
	}

}
