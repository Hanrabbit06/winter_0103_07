package thread.slideshow;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class imageSlideShow extends JFrame {
	JLabel lbl;
	JTextField tf;
	int time;
	ImageThread t;
	
	public imageSlideShow() {
		JPanel pan = new JPanel();
		tf = new JTextField(10);
		JButton btnTime = new JButton("time setting");
		btnTime.addActionListener(btnL);
		pan.add(tf);
		pan.add(btnTime);
		pan.setBackground(Color.white);
		add(pan, "North");
		
		ImageIcon icon = new ImageIcon("images/sky1.jpg");
		lbl = new JLabel(icon);
		add(lbl, "Center");
		
		setTitle("이미지슬라이드쇼");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(20, 30, 500, 500);
		setVisible(true);
		setResizable(false);
		t = new ImageThread(lbl);
		t.start();
	}

	public static void main(String[] args) {
		new imageSlideShow();
	}
	
	ActionListener btnL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			time = (int) (Double.parseDouble(tf.getText())*1000);
			t.setTime(time);
		}
	};
}
