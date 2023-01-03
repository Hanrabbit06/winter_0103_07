package thread.slideshow;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class imageSlideShow extends JFrame {
	JLabel lbl;
	
	public imageSlideShow() {
		ImageIcon icon = new ImageIcon("images/sky1.jpg");
		lbl = new JLabel(icon);
		add(lbl, "Center");
		
		setTitle("이미지슬라이드쇼");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(20, 30, 400, 400);
		setVisible(true);
		setResizable(false);
		
		imageThread t = new imageThread(lbl);
		t.start();
	}

	public static void main(String[] args) {
		new imageSlideShow();
	}

}
