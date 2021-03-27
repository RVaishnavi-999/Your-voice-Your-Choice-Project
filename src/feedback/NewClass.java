/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Lenovo
 */
public class NewClass {
    Connection con=null;
    
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/student","vaishnavi","vaishu");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
}
