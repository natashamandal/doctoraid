package com;
import java.sql.*;

public class database{
	
	static Connection con;    
	static Statement pst;    
	static ResultSet rs;
	String username; 
	String password;
	String connect;
	String conn;
    Boolean link=false;
	 
	void enter()    {        
		 try{                         
			 //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder            //ALSO SET THE CLASSPATH            
			 Class.forName(connect);      
			 
			 con=DriverManager.getConnection(conn,username,password);                       
			 pst=con.createStatement();                       }        
		 catch (Exception e)         {            
			 System.out.println(e);        
			 }    
	}
	 
	 String getu(){
		 return username;
	 }
	 
	 String getp(){
		 return password;
	 }
	 
	 void setu(String s)
	 {
		 username=s;
	 }
	 
	 void setp(String s)
	 {
		 password=s;
	 }
	 
		
	//ip:username,password   
	 //return boolean    
	 public Boolean checkLogin(String uname,String pwd)    {  
		
			if(uname.equals(username)&&pwd.equals(password)){
				link=true;
				return link;
			}
      return link;
		
		/* try {                                    
			 //this replaces the 1st  "?" in the query for username            
			  //this replaces the 2st  "?" in the query for password            
			 //executes the prepared statement            
			rs=pst.executeQuery("select * from patients");            
			 if(rs.next())            
			 {         
				 link=true;//TRUE iff the query founds any corresponding data                
				 return link;            
			 }           
			 else            
			 {     
				 link=false;
				 return link;            
			 }  
			 
			 } 
		 catch (Exception e) 
		     {            // TODO Auto-generated catch block            
				 System.out.println("error while validating"+e); 
				 link=false;
				 return link;        
				 }*/
			 }
		 
}
	 

	
