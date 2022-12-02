
package cwms;

import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Database {
    
    
private Connection con;
private Statement st;
private ResultSet rs;  
private PreparedStatement ps;
    
    
    
    Database(){
        try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/denezon?useLegacyDatetimeCode=flase&serverTimezone=UTC","root","");
               st=con.createStatement();
               System.out.println("Database Is Connected Successfully!");
               
           }
           catch(Exception e){
               System.out.println(e);
           }

}
    public void getlogin(){
        String query = "Select * from login_page";
        try{
            rs = st.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public ResultSet Slogin(String u,String p){
        String query = "Select * from login_page where Username='"+u+"' and Password = '"+p+"'";
        try{
            rs = st.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }
   
    
    public void CustomerTotal(String Customer_Name,String Car_Number,String Car_Name,String Customer_Email,int Total){
       
           try{
               String query="insert into car_table(Customer_Name,Car_Number,Car_Name,Customer_Email,Total)values('"+Customer_Name+"','"+Car_Number+"','"+Car_Name+"','"+Customer_Email+"','"+Total+"')";
               st.executeUpdate(query);
               }
           catch(Exception e){
//               JOptionPane.showMessageDialog(null,e);
               System.out.println(e);
               
           }
       }
    
            public void addCustomer(String Customer_Name,String Car_Number,String Car_Name,String Customer_Email){
           try{
               String query="insert into Customer_Reservation(Customer_Name,Car_Number,Car_Name,Customer_Email)values('"+Customer_Name+"','"+Car_Number+"','"+Car_Name+"','"+Customer_Email+"')";
               st.executeUpdate(query);
             
               }
           catch(Exception e){
            System.out.println(e);
           }
          
           
       }
            
       public ResultSet getData() {
        try {
            String sql = "select * from Customer_Reservation";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
       
       public ResultSet getDataForUpdate(){
           try {
               String query = "SELECT Customer_Name, Car_Number, Car_Name, Customer_Email FROM car_table";
                ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
            return null;
           }
       }
       
       
        
        public void deleteCostumer(String CustomerName){
           try{
           String query="DELETE FROM Customer_Reservation WHERE Customer_Name = '"+CustomerName+"'";
           st.executeUpdate(query);
           }catch(Exception e){
               System.out.println(e);
           }
       }
        
        public void deleteFromReservation(String Car_Number){
             try{
           String query="DELETE FROM Customer_Reservation WHERE Car_Number = '"+Car_Number+"'";
           st.executeUpdate(query);
           }catch(Exception e){
               System.out.println(e);
           }
        }
    
    public ResultSet searchRecord (String Car_Number){
           try{
           String query="select * from car_table where Car_Number like '"+Car_Number+"%'";
          //     System.out.println(query);
          rs=st.executeQuery(query);
           return rs;
           
           }
           catch(Exception e){
//               JOptionPane.showMessageDialog(null,e);
               System.out.println(e);
           }
           return rs;
        }
    
    public ResultSet searchForMenu(String Car_Number){
        try{
           String query="select * from Customer_Reservation where Car_Number like '"+Car_Number+"%'";
          //     System.out.println(query);
          rs=st.executeQuery(query);
           return rs;
           
           }
           catch(Exception e){
//               JOptionPane.showMessageDialog(null,e);
               System.out.println(e);
           }
           return rs;
    }
    
    
     public void updatecustomer(String Customer_Name, String Car_Number, String Car_Name, String Customer_Email){
           try{
               
               String query="update Customer_Reservation set Customer_Name='"+Customer_Name+"',Car_Number='"+Car_Number+"',Car_Name='"+Car_Name+"' where Customer_Email='"+Customer_Email+"'";
               //System.out.println(query);
               st.executeUpdate(query);
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
               
           }
                   }
     
     public void insertStaff(String Staff_Name,String Staff_Number,String Staff_Email){
          try{
             String query="INSERT INTO staff_info(Staff_Name,Staff_Number,Staff_Email) VALUES ('"+Staff_Name+"','"+Staff_Number+"','"+Staff_Email+"')";
               st.executeUpdate(query);
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
          }
          
      }
     
     public ResultSet getStaffInfo(){
           try{
               String query="Select * from staff_info";
               rs=st.executeQuery(query);
            }
           
           catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
              // System.out.println(e);
           }
           return rs;
           
       }
     
      public void deletestaff(String Staff_Number){
           try{
             String query="DELETE FROM staff_info WHERE Staff_Number='"+Staff_Number+"'";
              st.executeUpdate(query);
           }
           catch(Exception e){
             JOptionPane.showMessageDialog(null,e);  
           }
       }
       
     
     
    
    
    
    
}


