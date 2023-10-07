package pokeman;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import pokeman.CustomOutputStream;
import pokeman.GuiMenu;

public class GuiName {

	
	public GuiName() {
		
		
		JFrame main = new JFrame("Start");
		
		main.setLayout(null);
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setBounds(500,300,616,470);
		
		JLabel label = new JLabel ("Enter your name");
		label.setBounds(250,180,100,20);
		JTextField tf = new JTextField(20);
		tf.setBounds(250,200,100,20);
		JButton confirm = new JButton("Confirm");
		confirm.setBounds(260,225,80,20);
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
				main.setVisible(false);
				GuiMenu nextScreen = new GuiMenu();
			}
		});
		main.getContentPane().add(label);
		main.getContentPane().add(tf);
		main.getContentPane().add(confirm);
		main.setVisible(true);
	}

}
