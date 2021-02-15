/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package househunter;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author hebil
 */
public class Postgresql implements DBManager {
    Connection c = null;
    Statement stmt = null;
    String url = "jdbc:postgresql://localhost:5432/househunter";
    String user = "postgres";
    String password = "1058";
    private static final String QUERY = "select id,name,email,country,password from Users where id =?";
    
    public Postgresql() {
        
        
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                .getConnection(url,user, password);
            stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS users " +
                "(ID             SERIAL     PRIMARY KEY," +
                " name           TEXT       NOT NULL, " +
                " phonenumber    CHAR(13)   NOT NULL, " +
                " emailaddress   CHAR(50)   UNIQUE, " +
                " password       CHAR(50)," +
                " usertype       CHAR(50)," +
                " createdat      CHAR(50))";
            
            String sqlForHouses = "CREATE TABLE IF NOT EXISTS houses " +
                "(ID             SERIAL     PRIMARY KEY," +
                " city           TEXT       NOT NULL, " +
                " owner    CHAR(10000)   NOT NULL, " +
                " rentorsale   CHAR(10)  , " +
                " address       CHAR(50)," +
                " hsedetails       CHAR(100)," +
                " nrbedrooms       CHAR(50)," +
                " rentorprice       CHAR(50)," +
                " isbooked       INT," + 
                " appointment       CHAR(100)," +
                " createdat      CHAR(50))";
            
            String sqlForOwner = "CREATE TABLE IF NOT EXISTS owners " +
                "(ID             SERIAL     PRIMARY KEY," +
                " houses           TEXT       NOT NULL, " +
                " createdat      CHAR(50))";
            
            stmt.executeUpdate(sql);
            stmt.executeUpdate(sqlForHouses);
            stmt.executeUpdate(sqlForOwner);
            stmt.close();
            //c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        } 
    }

    @Override
    public int get() {
        System.out.println(c);
        return 1;
    }

    @Override
    public int delete(int id) {
        try {
            c.createStatement().executeUpdate("DELETE FROM \"users\" WHERE id="+id);
        } catch (SQLException ex) {
            return 0;
        }
        return 1;
    }
    
    public int removeHouse(int id) {
        try {
            c.createStatement().executeUpdate("DELETE FROM \"houses\" WHERE id="+id);
        } catch (SQLException ex) {
            return 0;
        }
        return 1;
    }
    

    @Override
    public int update() {
        return 1;
    }

    @Override
    public int insertUser(String name,String phoneNumber,String emailAddress,String password,String userType) {
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
        try {
            c.createStatement().executeUpdate("INSERT INTO \"users\" (\"name\", \"phonenumber\" , \"emailaddress\",\"password\",\"usertype\",\"createdat\") "
                    + "VALUES ('"+ name + "', '" + phoneNumber + "','"+ emailAddress + "', '" + password + "','" + userType + "', '" + timeStamp + "')");
        } catch (SQLException ex) {
            return 0;
        }
        return 1;
    }
    
    public ArrayList<String> getUserById(int id) {
        ArrayList<String> userinfo = new ArrayList<String>();
        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pst = con.prepareStatement("SELECT * FROM users WHERE id="+id);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                userinfo.add(rs.getString(1));
                userinfo.add(rs.getString(2));
                userinfo.add(rs.getString(3));
                userinfo.add(rs.getString(4));
                userinfo.add(rs.getString(5));
                userinfo.add(rs.getString(6));
                userinfo.add(rs.getString(7));
            }

        } catch (SQLException ex) {
            return new ArrayList<String>();
        }
        return userinfo;
    }
    
    public ArrayList<String> getUserByEmail(String email) {
        ArrayList<String> userinfo = new ArrayList<String>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
                
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"users\" WHERE \"emailaddress\"="+"'"+email+"'");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            while (rs.next()) {
                userinfo.add(rs.getString(1));
                userinfo.add(rs.getString(2));
                userinfo.add(rs.getString(3));
                userinfo.add(rs.getString(4));
                userinfo.add(rs.getString(5));
                userinfo.add(rs.getString(6));
                userinfo.add(rs.getString(7));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String>();
        }
        return userinfo;
    }
    
    @Override
    public int insertHouse(String city,int ownerId,String rentOrsale,String address,String hsedetails,String Nrbedrooms,String rentorPrice,String isBooked) {
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
        try {
            c.createStatement().executeUpdate("INSERT INTO \"houses\" (\"city\", \"owner\" , \"rentorsale\",\"address\",\"hsedetails\",\"nrbedrooms\",\"rentorprice\",\"isbooked\",\"createdat\") "
                    + "VALUES ('"+ city + "', '" + ownerId + "','"+ rentOrsale + "','"+ address + "','"+ hsedetails + "','"+ Nrbedrooms + "','"+ rentorPrice + "','"+ isBooked + "', '" + timeStamp + "')");
        } catch (SQLException ex) {
            System.out.println(ex);
            return 0;
        }
        return 1;
    }
    
    public ArrayList<String[]> getHouseById(int id) {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
                
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"id\"="+"'"+id+"'");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[11];
            while (rs.next()) {
                temp = new String[11];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(2));
                temp[2] = (rs.getString(3));
                temp[3] = (rs.getString(4));
                temp[4] = (rs.getString(5));
                temp[5] = (rs.getString(6));
                temp[6] = (rs.getString(7));
                temp[7] = (rs.getString(8));
                temp[8] = (rs.getString(9));
                temp[9] = (rs.getString(10));
                temp[10] = (rs.getString(11));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        return houses;
    }
    
    
     public ArrayList<String[]> getAllHouses() {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
                
            PreparedStatement pst = con.prepareStatement("SELECT * FROM houses");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[10];
            while (rs.next()) {
                temp = new String[10];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(2));
                temp[2] = (rs.getString(3));
                temp[3] = (rs.getString(4));
                temp[4] = (rs.getString(5));
                temp[5] = (rs.getString(6));
                temp[6] = (rs.getString(7));
                temp[7] = (rs.getString(8));
                temp[8] = (rs.getString(9));
                temp[9] = (rs.getString(10));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        return houses;
    }
    
    public ArrayList<String[]> getHousesForRent() {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
                
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"rentorsale\"="+"'"+"Rent"+"'"+" AND \"appointment\" IS NULL");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[10];
            while (rs.next()) {
                temp = new String[10];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(2));
                temp[2] = (rs.getString(3));
                temp[3] = (rs.getString(4));
                temp[4] = (rs.getString(5));
                temp[5] = (rs.getString(6));
                temp[6] = (rs.getString(7));
                temp[7] = (rs.getString(8));
                temp[8] = (rs.getString(9));
                temp[9] = (rs.getString(10));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        return houses;
    }
    
    public ArrayList<String[]> getHousesForSale() {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
                
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"rentorsale\"="+"'"+"Sale"+"'"+" AND \"appointment\" IS NULL");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[10];
            while (rs.next()) {
                temp = new String[10];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(2));
                temp[2] = (rs.getString(3));
                temp[3] = (rs.getString(4));
                temp[4] = (rs.getString(5));
                temp[5] = (rs.getString(6));
                temp[6] = (rs.getString(7));
                temp[7] = (rs.getString(8));
                temp[8] = (rs.getString(9));
                temp[9] = (rs.getString(10));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        return houses;
    }
    
    
    
    
    public ArrayList<String[]> getHousesForCriteria(String type,String city,int min,int max) {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        if (type.equals("All")) {
                try (Connection con = DriverManager.getConnection(url, user, password);
              
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"city\"="+"'"+city+"' AND "+"\"isbooked\" BETWEEN "+"'"+min+"'"+ " AND "+"'"+max+"'");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[10];
            while (rs.next()) {
                temp = new String[10];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(2));
                temp[2] = (rs.getString(3));
                temp[3] = (rs.getString(4));
                temp[4] = (rs.getString(5));
                temp[5] = (rs.getString(6));
                temp[6] = (rs.getString(7));
                temp[7] = (rs.getString(8));
                temp[8] = (rs.getString(9));
                temp[9] = (rs.getString(10));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
           }else{
            try (Connection con = DriverManager.getConnection(url, user, password);
              
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"rentorsale\"="+"'"+type+"'"+" AND "+"\"city\"="+"'"+city+"' AND "+"\"isbooked\" BETWEEN "+"'"+min+"'"+ " AND "+"'"+max+"'");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[10];
            while (rs.next()) {
                temp = new String[10];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(2));
                temp[2] = (rs.getString(3));
                temp[3] = (rs.getString(4));
                temp[4] = (rs.getString(5));
                temp[5] = (rs.getString(6));
                temp[6] = (rs.getString(7));
                temp[7] = (rs.getString(8));
                temp[8] = (rs.getString(9));
                temp[9] = (rs.getString(10));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        }
        
        return houses;
    }
    
    public ArrayList<String[]> getHouseByOwner(int ownerId) {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
                
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"owner\"="+"'"+ownerId+"'");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[10];
            while (rs.next()) {
                temp = new String[10];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(2));
                temp[2] = (rs.getString(3));
                temp[3] = (rs.getString(4));
                temp[4] = (rs.getString(5));
                temp[5] = (rs.getString(6));
                temp[6] = (rs.getString(7));
                temp[7] = (rs.getString(8));
                temp[8] = (rs.getString(9));
                temp[9] = (rs.getString(10));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        return houses;
    }
    
    public ArrayList<String[]> getِAppointmentByOwner(int ownerId) {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
                
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"owner\"="+"'"+ownerId+"'"+" AND \"appointment\" IS NOT NULL");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[3];
            while (rs.next()) {
                temp = new String[10];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(5));
                temp[2] = (rs.getString(10));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        return houses;
    }
    
    public ArrayList<String[]> getِAppointmentByHunter(int hunterId) {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
                
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"appointment\" IS NOT NULL");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[5];
            while (rs.next()) {
                temp = new String[5];
                try{
                    String[] aaa = rs.getString(10).trim().split(",");
                    
                    if (aaa.length == 5) {
                        String l = aaa[4].trim();
                        if (Integer.parseInt(l) == hunterId) {
                            temp[0] = (rs.getString(1));
                            temp[1] = (rs.getString(5));
                            temp[2] = (rs.getString(10));
                            houses.add(temp);
                        }
                    }
                    
                }catch (SQLException ex) {
                    //System.out.println(ex);
                }
                
        
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        return houses;
    }
    
    public boolean removeAppointment(int houseid){
        try  (Connection con = DriverManager.getConnection(url, user, password);
                 PreparedStatement pst = con.prepareStatement("UPDATE \"houses\""+ "SET \"appointment\"=NULL "+ "WHERE \"id\"="+"'"+houseid+"'");
                ResultSet rs = pst.executeQuery()){
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
        return true;
    }
    
    public ArrayList<String[]> getHouseByCity(String city) {
        ArrayList<String[]> houses = new ArrayList<String[]>(); 
        try (Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM \"houses\" WHERE \"city\"="+"'"+city+"'");
            ResultSet rs = pst.executeQuery()) {
            System.out.println(rs);
            String[] temp = new String[11];
            while (rs.next()) {
                temp = new String[10];
                temp[0] = (rs.getString(1));
                temp[1] = (rs.getString(2));
                temp[2] = (rs.getString(3));
                temp[3] = (rs.getString(4));
                temp[4] = (rs.getString(5));
                temp[5] = (rs.getString(6));
                temp[6] = (rs.getString(7));
                temp[7] = (rs.getString(8));
                temp[8] = (rs.getString(9));
                temp[9] = (rs.getString(10));
                temp[10] = (rs.getString(11));
                houses.add(temp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return new ArrayList<String[]>();
        }
        return houses;
    }
    
    public int bookAppointment(int houseId,String bookInfos){
        try  (Connection con = DriverManager.getConnection(url, user, password);
                 PreparedStatement pst = con.prepareStatement("UPDATE \"houses\""+ "SET \"appointment\"="+"'"+bookInfos+"'"+ "WHERE \"id\"="+"'"+houseId+"'");
                ResultSet rs = pst.executeQuery()){
        } catch (SQLException ex) {
            System.out.println(ex);
            return 0;
        }
        return 1;
    }
}
