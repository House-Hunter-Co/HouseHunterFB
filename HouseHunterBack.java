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

public class HouseHunterBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Postgresql q = new Postgresql();
        //q.insertUser("osaıosı", "dkjsdkjsdjk", "dsdsd", "ssss", "sssss");
        //q.bookAppointment(8, "kdkjfskjfdjkfdsjksdf");
        //q.insertHouse("Ankara",1,"rent","123.street any city any region","Lorem ipsum dolor sit amet, consectetur adipisicing elit","3","100","true");
        //q.insertHouse("Istanbul",1,"sale","123.street any city any region","Lorem ipsum dolor sit amet, consectetur adipisicing elit","3","100","true");
        var a = q.getHousesForCriteria("Sale", "Adana", 1, 22);
        var l = q.getِAppointmentByOwner(1);
        var f = q.getِAppointmentByHunter(12);
        System.out.println(f);
    }
    
}
