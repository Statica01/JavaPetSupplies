package domain.entities.wishList;
import domain.entities.shop.Product;
//import jdk.internal.jimage.ImageReader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class WishList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    //public ImageReader.Node getSelectedProducts;
    private ArrayList<String> selectedProducts;
    private static int idNr = 0;
    private int customerNumber;
    private String productId;

    public WishList(int c) {

        selectedProducts = new ArrayList<>();
        customerNumber = c;
        id = idNr;
        idNr++;
    }

    public void addProduct(Product product) {
        selectedProducts.add(product.getModelNr());
    }

    public ArrayList<String> getSelectedProducts() {
        return this.selectedProducts;
    }

    public void setCustomerNumber(int customerNumber) {
        customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setProductId(String productId) {
        productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public int getId() { return id; }

    public void removeProduct(Product product) {
        productId = product.getModelNr();
        for(int i = 0; i < selectedProducts.size(); i++) {
            if(selectedProducts.get(i) == productId) {
                selectedProducts.remove(i);
                break; //in case there are many, only one instance should be removed
            }
        }
    }
}
