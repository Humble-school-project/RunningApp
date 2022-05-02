import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Framingframe implements ActionListener {
		 int count = 0;
		 JFrame frame;
		
		JPanel panel;
		JLabel passlabel;
		JLabel userlabel;
		public Framingframe() {
			
			 frame = new JFrame();
			
			userlabel = new JLabel("username");
			JTextField username = new JTextField(20);
			username.setBounds(10, 20, 160, 50);
			passlabel = new JLabel("password");
			JTextField password = new JTextField(20);
			password.setBounds(100, 200, 1650, 250);			
			 JButton button = new JButton("login");
				button.addActionListener(this);
				button.setBounds(50, 10, 16, 25);
				
				
			 panel = new JPanel();
			panel.setBorder(BorderFactory.createEmptyBorder(100, 100 ,100 ,100));//(top, bottom, left , right)
			panel.setLayout(new GridLayout(0, 1));
			panel.add(userlabel);
			panel.add(username);
			panel.add(passlabel);
			panel.add(password);
			panel.add(button);
			
			frame.add(panel, BorderLayout.CENTER);
			frame.setSize(1,0);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("tacker login");
			frame.pack();
			frame.setVisible(true);
			
 		}
	public static void main(String[] args) { 
		new Framingframe();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
