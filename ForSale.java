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

public class ForSale extends Houses {


   
     public ForSale(int id, String city, int ownerID, String rentOrsale, String address,String hsedetails, int Nrbedrooms, double rentorPrice, boolean isBooked) {
       super(id, city,  ownerID,  rentOrsale,address,hsedetails,Nrbedrooms, rentorPrice,isBooked);


    }

 
   @Override
    public int getHouseId() {
        return id;
    }


 
   @Override
    public String toString() {
       return "ForSale{" + ", houseId= " + id + "City: " +  city +"Address: " +  address + "Number of bedrooms: " +  Nrbedrooms +" House price= " + rentorPrice +  "Owner " + ownerId + '}';
    }

   
}