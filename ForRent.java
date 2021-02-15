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
public class ForRent extends Houses {

   

    public ForRent (int id, String city, int ownerId, String rentOrsale,String address, String hsedetails, int Nrbedrooms, double rentorPrice, boolean isBooked) {
       super(id, city,  ownerId,  rentOrsale,address,hsedetails,Nrbedrooms, rentorPrice,isBooked);
       
    }

  



    
    @Override
    public int getHouseId() {

        return id;
    }

  
   
    
    @Override
    public String toString() {
    return "ForRent{" + ", houseId= " + id + "City: " +  city + "Address: " +  address +"Number of bedrooms: " +  Nrbedrooms +" mounthlyRent= " + rentorPrice +  "Owner Id  " + ownerId + '}';
}
 
    
}