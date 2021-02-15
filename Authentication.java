/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package househunter;

/**
 *
 * @author hebil
 */
public interface Authentication {
    Postgresql q = new Postgresql();
    
    int LOGIN_USER = 0; // Default value is zero because there is no any user login ..if any user login this value change with the user's ID
    public static int login(String email, String password){
        String pwd = "";
        int temp = 0;
        try{
            pwd = q.getUserByEmail(email).get(4).trim();
            temp = Integer.parseInt(q.getUserByEmail(email).get(0)); // get user ıd
            System.out.println(temp+"***");
        }catch(Exception e){
            return 0;
        }
        System.out.println(pwd+"-"+password);
        if(pwd.equals(password)){
            return temp;
        }
        else{
            return 0;
        }
        
    }
    public static int register(String name,String phoneNumber,String emailAddress,String password,String userType) {
        int r = q.insertUser(name, phoneNumber, emailAddress, password,userType);
        return r;
    }
    public static int logout() {
        return 1;
    }
}
