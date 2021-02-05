package domain.entities.customer;

import domain.entities.wishList.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String UserName;
    private String Password;
    private int CustomerId;
    private static int CustomerNumber = 0;
    private ArrayList<WishList> wishLists;
    private WishList wishList;

    public Customer(String name, String pass) {

        UserName = name;
        Password = pass;
        CustomerId = CustomerNumber;
        CustomerNumber++;
        wishLists = new ArrayList<>();
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void setCustomerNumber(int customerNumber) {
        CustomerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public WishList getWishList(int id) {

        for(WishList l : wishLists) {
            if(l.getId() == id) {
                wishList = l;
            }
        }

        return wishList;
    }
}
