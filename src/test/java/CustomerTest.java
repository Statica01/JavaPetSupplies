/* import domain.entities.customer.Customer;
import domain.entities.shop.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Customer Test")
public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void enterCustomers() {
        customer = new Customer("Per","withoutSpaces");
        domain.entities.shop.CustomerBank.addCustomer(customer);
        customer = new Customer("Magnus","with Space");
        domain.entities.shop.CustomerBank.addCustomer(customer);
        customer = new Customer("Carita","!##");
        domain.entities.shop.CustomerBank.addCustomer(customer);
        customer = new Customer("Staffan Åberg","");
        domain.entities.shop.CustomerBank.addCustomer(customer);
    }

    @org.junit.Test
    @Disabled("disabled") //shouldn't work
    public void prelTest() {
        assertTrue(true);
    }

    /**
     * When multiple customers are created, the static int id is incremented properly
     *//*
    @org.junit.jupiter.api.Test
    public void staticVarIsUpdatedCorrectly() {
        customer = domain.entities.shop.CustomerBank.getCustomerByName("Carita");
        assertEquals(customer.getCustomerId(),3);
    }*/

    /**
     * Wish list array is empty
     *//*
    @org.junit.jupiter.api.Test
    public void wishListArrayIsEmpty() {
        customer.addWishList();
        assertTrue(customer.getWishLists().size() == 1);
    }
}*/
