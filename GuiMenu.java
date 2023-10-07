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

	
public class GuiMenu {
		
	public GuiMenu() {
		
		
		JFrame main = new JFrame ();
		main.setLayout(null);
		
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setBounds(500,300,616,470);
	     
		 
		 JButton fight = new JButton("Fight");
		 fight.setBounds(0,0,300,143);
		
			fight.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					main.setVisible(false);
					
				}
			});
		 
		 JButton talk = new JButton("Talk");
		 talk.setBounds(300,0,300,143);
		
		 JButton item = new JButton("Item");
		 item.setBounds(0,143,300,143);
		 
		 JButton stats = new JButton("Stats");
		 stats.setBounds(300,143,300,143);
		 
		 JButton quit = new JButton("Quit");
		 quit.setBounds(0,286,300,143);
			quit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					main.setVisible(false);
					System.exit(1);
				}
			});
		 
		 JButton shop = new JButton("Shop");
		 shop.setBounds(300,286,300,143);
		 
			    
		 main.getContentPane().add(fight);
		 main.getContentPane().add(item);
		 main.getContentPane().add(stats);
		 main.getContentPane().add(talk);
		 main.getContentPane().add(quit);
		 main.getContentPane().add(shop);
		 main.setVisible(true);
	     
	}
 }
	
     
 