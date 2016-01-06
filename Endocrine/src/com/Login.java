package com;
import java.awt.*;
import javax.swing.*;


import java.awt.event.*;
public class Login extends JPanel
{
//declaring our swing components
JLabel l_name,l_pass;
JTextField t_name;
JPasswordField t_pass; //A special JTextField but hides input text
JButton button;

//a inner class to handling ActionEvents
handler handle;
//a separate class for processing database connection and authentication

Login()
{

setLayout(new FlowLayout());
//extra classes

handle =new handler();
//swing components
l_name=new JLabel("Username");
l_pass=new JLabel("Password");
t_name=new JTextField(10);
t_pass=new JPasswordField(10);
button=new JButton("Login");
//adding actionlistener to the button
button.addActionListener(handle);
//add to contaienr
add(l_name);
add(t_name);
add(l_pass);
add(t_pass);
add(button);
//visual

}

//an inner class .You can also write as a separate class
class handler implements ActionListener
{
//must implement method
//This is triggered whenever the user clicks the login button
@Override
public void actionPerformed(ActionEvent ae)
{
//checks if the button clicked
		
if(ae.getSource()==button)
{
	
char[] temp_pwd=t_pass.getPassword();
String pwd=null;
pwd=String.copyValueOf(temp_pwd);
System.out.println("Username,Pwd:"+t_name.getText()+","+pwd);
//The entered username and password are sent via "checkLogin()" which return boolean
if(DB_Details.db.checkLogin(t_name.getText(), pwd))
{
//a pop-up box
	DB_Details.db.enter();
JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
JOptionPane.INFORMATION_MESSAGE);
}
else
{
//a pop-up box
JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
JOptionPane.ERROR_MESSAGE);
}
}//if
}//method
}//inner class
}//class
