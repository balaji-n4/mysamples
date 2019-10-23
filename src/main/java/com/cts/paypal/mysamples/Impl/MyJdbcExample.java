package com.cts.paypal.mysamples.Impl;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;    
class MyJdbcExample implements DriverAction{    
 @Override  
 public void deregister() {  
     System.out.println("Driver deregistered");  
 }  
 public static void main(String args[]){  
     try{  
         Driver driver = new com.mysql.jdbc.Driver();  
         DriverAction da = new MyJdbcExample();  
         DriverManager.registerDriver(driver, da);  
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mypaypaldb","root","root");  
         Statement stmt=con.createStatement();   
         ResultSet rs=stmt.executeQuery("select * from employee");    
         while(rs.next()){    
             System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));    
         }  
         con.close();    
         DriverManager.deregisterDriver(driver);  
     }catch(Exception e){ System.out.println(e);}    
 }    
   
}   