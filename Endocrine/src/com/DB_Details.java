package com;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class DB_Details extends JPanel implements ActionListener{
	
	JTextField det;
	JTextField db_name;
	JTextField tab_name;
	JTextField user;
	JTextField pass;
	JButton Enter;
	static database db;
	
	DB_Details(){
		
	 setLayout(new FlowLayout());
	 det = new JTextField("Enter path for connection, ex com.mysql.jdbc.Driver");
	 add(det);
	 db_name = new JTextField("Enter the path with database, ex jdbc:mysql://localhost:3307/db");
	 add(db_name);
	 tab_name = new JTextField("Enter the name of the created table in the order Name, Place, Gender, Symptoms, Diagnosis, Status");
	 add(tab_name);
	 user = new JTextField("Enter username");
	 add(user);
	 pass = new JTextField("Enter password");
	 add(pass);
	 Enter = new JButton("Enter");
	 Enter.addActionListener(this);
	 add(Enter);
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
			
			db= new database();
		db.connect=det.getText().toString().trim();
		db.conn= db_name.getText().toString().trim();
		db.username= user.getText().toString().trim();
		db.password= pass.getText().toString().trim();
		
		JTabbedPaneDemo.store.table=tab_name.getText().toString();
		
	}
	

}
