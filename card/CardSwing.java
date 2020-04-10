package com.jse.card;
import java.awt.FlowLayout;

import javax.swing.*;
public class CardSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("카드게임");
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		frame.add(panel);
		
		frame.setVisible(true);
	}
	
}
