/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

/**
 *
 * @author bkpl
 */
public class Customer {
    String name;
    String address;
    String contact;
    String email;
    
//    setters
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
//    getters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getContact(){
        return contact;
    }
    public String getEmail(){
        return email;
    }
}
