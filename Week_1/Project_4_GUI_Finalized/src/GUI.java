import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI implements ActionListener
{
	int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() 
	{
		JFrame frame = new JFrame();
		panel = new JPanel();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0");
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		//button Panel
		panel.add(button);
		//jlabel
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new GUI();
	}

	
	public void actionPerformed(ActionEvent arg0) 
	{
		count++;
		label.setText("Number of clicks: " + count);
	}
}
