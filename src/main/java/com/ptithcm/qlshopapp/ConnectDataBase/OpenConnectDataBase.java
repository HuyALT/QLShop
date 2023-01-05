/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.ConnectDataBase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class OpenConnectDataBase {
      public static Connection OpenConnection() throws Exception {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String URL = "jdbc:sqlserver://localhost;database=QLSQA;encrypt=true;trustServerCertificate=true;";
           String user = "sa";
           String pasword = "04052002";
           Connection con = DriverManager.getConnection(URL, user, pasword);
           return con;
   }
}
