package pokeman;


import javax.swing.*;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import pokeman.CustomOutputStream;
import pokeman.GuiName;

	
public class GuiStart {
		
	public GuiStart() {
		
		
		JFrame frame = new JFrame("Action");
		JFrame main = new JFrame ("Start");
		main.setLayout(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setBounds(500,300,616,470);
	     
		 JMenuBar mb = new JMenuBar();
		 JMenu m1 = new JMenu("FILE");
		 JMenu m2 = new JMenu("Help");
		 mb.add(m1);
		 mb.add(m2);
		 JMenuItem m11 = new JMenuItem("Open");
		 JMenuItem m12 = new JMenuItem("Save as");
		 m1.add(m11);
		 m1.add(m12);
		 mb.setBounds(0,0,600,30);
		 
		 JButton new_game = new JButton("New Game");
		 new_game.setBounds(0,30,300,200);
		
			new_game.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					main.setVisible(false);
					GuiName screenName = new GuiName();
				}
			});
		 
		 JButton load = new JButton("Load game");
		 load.setBounds(300,30,300,200);
		
		 JButton quit = new JButton("Quit");
		 quit.setBounds(0,230,300,200);
			quit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					main.setVisible(false);
					System.exit(1);
				}
			});
		 
		 JButton setting = new JButton("Settings");
		 setting.setBounds(300,230,300,200);
		 
		 JTextArea ta = new JTextArea();
		 PrintStream printStream = new PrintStream(new CustomOutputStream(ta));
		 System.setOut(printStream);
		 System.setErr(printStream);
		 
		 JPanel panel = new JPanel(); 
		 JLabel label = new JLabel("Enter Text");
		 JTextField tf = new JTextField(10); 
		 JButton send = new JButton("Send");
		 send.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){  
			         System.out.println(tf.getText());
			 }
		 });
		 JButton reset = new JButton("Reset");
		 reset.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){  
			         tf.setText("");
			 }
		 });
		 panel.add(label); 
		 panel.add(tf);
		 panel.add(send);
		 panel.add(reset);
		 
			    
		 frame.getContentPane().add(BorderLayout.SOUTH, panel);
		 frame.getContentPane().add(BorderLayout.CENTER, ta);
		 main.getContentPane().add(mb);
		 main.getContentPane().add(new_game);
		 main.getContentPane().add(load);
		 main.getContentPane().add(quit);
		 main.getContentPane().add(setting);
		 frame.setVisible(true);
		 main.setVisible(true);
	     
	}
 }
	
     
 