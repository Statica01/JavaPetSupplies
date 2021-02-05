package domain.entities.customer;

import domain.entities.wishList.*;
//import jdk.internal.jimage.ImageReader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Customer {
    //public ImageReader.Node getWishLists;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private int customerId;
    private static int customerNumber = 1;
    private ArrayList<WishList> wishLists;
    private WishList wishList;

    public Customer(String name, String pass) {

        userName = name;
        password = pass;
        customerId = customerNumber;
        customerNumber++;
        wishLists = new ArrayList<>();
    }

    public void setUserName(String name) {
        userName = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String pass) {
        password = pass;
    }

    public String getPassword() {
        return password;
    }

/*    public void setCustomerId(int customerNumber) {
        CustomerNumber = customerNumber;
    }*/

    public int getCustomerId() {
        return customerId;
    }

    public WishList getWishList(int id) {

        for(WishList l : wishLists) {
            if(l.getId() == id) {
                wishList = l;
            }
        }

        return wishList;
    }

    public ArrayList<WishList> getWishLists() {
        return wishLists;
    }

    public void addWishList() {
        wishList = new WishList(customerId);
        wishLists.add(wishList);
    }

/*    public WishList getWishList(int id) {

    }*/
}
