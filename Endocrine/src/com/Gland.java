package com;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class Gland extends JPanel implements ActionListener{
	
	JTextField jtf;
	
	public Gland(){
		ImageIcon i = new ImageIcon("Quotes.jpg");
		JButton b1 = new JButton(new ImageIcon("Hypothalmus.jpg"));
		b1.setActionCommand("Hypothalmus");
		b1.addActionListener(this);
		b1.setRolloverIcon(i);
		b1.setSize(100, 100);
		add(b1);
		JButton b2 = new JButton(new ImageIcon("Pituitary Gland.jpg"));
		b2.setActionCommand("Pituitary Gland");
		b2.addActionListener(this);
		b2.setRolloverIcon(i);
		add(b2);
		JButton b3 = new JButton(new ImageIcon("Pineal Gland.jpg"));
		b3.setActionCommand("Pineal Gland");
		b3.addActionListener(this);
		b3.setRolloverIcon(i);
		add(b3);
		JButton b4 = new JButton(new ImageIcon("Thyroid Gland.jpg"));
		b4.setActionCommand("Thyroid Gland");
		b4.addActionListener(this);
		b4.setRolloverIcon(i);
		add(b4);
		JButton b5 = new JButton(new ImageIcon("Parathyroid Gland.jpg"));
		b5.setActionCommand("Parathyroid Gland");
		b5.addActionListener(this);
		b5.setRolloverIcon(i);
		add(b5);
		JButton b6 = new JButton(new ImageIcon("Thymus.jpg"));
		b6.setActionCommand("Thymus");
		b6.addActionListener(this);
		b6.setRolloverIcon(i);
		add(b6);
		JButton b7 = new JButton(new ImageIcon("Pancreas.jpg"));
		b7.setActionCommand("Pancreas");
		b7.addActionListener(this);
		b7.setRolloverIcon(i);
		add(b7);
		JButton b8 = new JButton(new ImageIcon("Adrenal Gland.jpg"));
		b8.setActionCommand("Adrenal Gland");
		b8.addActionListener(this);
		b8.setRolloverIcon(i);
		add(b8);
		JButton b9 = new JButton(new ImageIcon("Testis.jpg"));
		b9.setActionCommand("Testis");
		b9.addActionListener(this);
		b9.setRolloverIcon(i);
		add(b9);
		JButton b10 = new JButton(new ImageIcon("Ovaries.jpg"));
		b10.setActionCommand("Ovaries");
		b10.addActionListener(this);
		b10.setRolloverIcon(i);
		add(b10);
		jtf = new JTextField(20);
		add(jtf);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
		}

}
