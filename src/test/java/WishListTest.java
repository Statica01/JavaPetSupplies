import domain.entities.customer.Customer;
import domain.entities.shop.Catalog;
import domain.entities.shop.Product;
import domain.entities.wishList.WishList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

@DisplayName("Wish List Test")
public class WishListTest {

    WishList list;
    Customer customer;
    Product product;
    Catalog catalog = new Catalog();

    @BeforeEach
    public void enterWishList() {
        list = new WishList(1);
        product = new Product("Berner Sennen Shampoo",
                "A1",
                99,
                "B1",
                1,
                "Shampoo.",
                catalog
        );
    }

    /**
     *List is created and correct user is retrieved
     */
    @Test
    public void userIsRetrievedCorrectly() {
        assertEquals(list.getCustomerNumber(),1);
    }

    /**
     * item is added to wish list
     */
    @Test
    public void itemIsAddedToWishList() {
        list.addProduct(product);
        list.addProduct(product);
        assertEquals(list.getSelectedProducts().size(), 2);
    }

    /**
     * item is deleted from wish list
     */
    @Test
    public void itemIsRemovedFromWishList() {
        list.addProduct(product);
        list.addProduct(product);
        list.removeProduct(product);
        assertEquals(list.getSelectedProducts().size(), 1);
    }
}
