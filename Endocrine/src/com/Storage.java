package com;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;


public class Storage extends JPanel implements ActionListener, ItemListener {
	JTextField Name, Place, Symptoms, Diagnosis;
	JRadioButton Male, Female;
	JCheckBox Status;
	JButton Submit;
	ButtonGroup b;
	static String table;
	Storage(){
		setLayout(new FlowLayout());
		
		Name = new JTextField("Name",20);
		/*Name.addActionListener(this);*/
		add(Name);
		Place = new JTextField("Place",20);
		/*Place.addActionListener(this);*/
		add(Place);
		Male = new JRadioButton("Male");
		/*Male.addActionListener(this);*/
		Male.setActionCommand("Male");
		add(Male);
		Female = new JRadioButton("Female");
		/*Female.addActionListener(this);*/
		Female.setActionCommand("Female");
		add(Female);
		b = new ButtonGroup();
		b.add(Male);
		b.add(Female);
		Symptoms = new JTextField("Symptoms",20);
		/*Symptoms.addActionListener(this);*/
		add(Symptoms);
		Diagnosis = new JTextField("Diagnosis",20);
		/*Diagnosis.addActionListener(this);*/
		add(Diagnosis);
		Status = new JCheckBox("Cured");
		/*Status.addItemListener(this);*/
		Status.setActionCommand("Cured");
		add(Status);
		Submit = new JButton("Submit");
		Submit.addActionListener(this);
		add(Submit);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(DB_Details.db.link.equals(true))
		{
			try {
				if(Male.isSelected()&&Status.isSelected()){
				    database.pst.executeUpdate("insert into "+table+ " values("+"'"+Name.getText()+"'"+","+"'"+Place.getText()+"'"+","+"'"+Male.getActionCommand()+"'"+","+"'"+Symptoms.getText()+"'"+","+"'"+Diagnosis.getText()+"'"+","+"'"+Status.getActionCommand()+"'"+")") ;
				}
				if(Female.isSelected()&&Status.isSelected()){
					database.pst.executeUpdate("insert into "+table+ " values("+"'"+Name.getText()+"'"+","+"'"+Place.getText()+"'"+","+"'"+Female.getActionCommand()+"'"+","+"'"+Symptoms.getText()+"'"+","+"'"+Diagnosis.getText()+"'"+","+"'"+Status.getActionCommand()+"'"+")") ;	
				}
				if(Female.isSelected()&&(!Status.isSelected())){
					database.pst.executeUpdate("insert into "+table+ " values("+"'"+Name.getText()+"'"+","+"'"+Place.getText()+"'"+","+"'"+Female.getActionCommand()+"'"+","+"'"+Symptoms.getText()+"'"+","+"'"+Diagnosis.getText()+"'"+","+null+")") ;	
				}
				if(Male.isSelected()&&(!Status.isSelected())){
					database.pst.executeUpdate("insert into "+table+ " values("+"'"+Name.getText()+"'"+","+"'"+Place.getText()+"'"+","+"'"+Male.getActionCommand()+"'"+","+"'"+Symptoms.getText()+"'"+","+"'"+Diagnosis.getText()+"'"+","+null+")");
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
