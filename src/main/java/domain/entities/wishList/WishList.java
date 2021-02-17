package domain.entities.wishList;

import domain.entities.shop.Product;

//import jdk.internal.jimage.ImageReader;


public class WishList {
    //@Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    //public ImageReader.Node getSelectedProducts;
    // private ArrayList<String> selectedProducts;
    //private static int idNr = 0;
    //private int customerNumber;
   // private String productId;
    private String productName;
    public Product Product;
    public int productId;
    public int productPrice;


    public WishList(int productId, String productName, int productPrice) {

        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;

        /*selectedProducts = new ArrayList<>();
        customerNumber = c;
        id = idNr;
        idNr++;*/
    }

  /*  public void addProduct(Product product) {
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
    }*/

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() { return productPrice; }

    public void setProductPrice(int productPrice) { this.productPrice = productPrice; }

    public int getId() {
        return id;
    }

   /*   @Override
    public String toString() {return String.format("WishList [productId=%s, productName=%s]", productId, productName);}
   @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WishList other = (WishList) obj;
        if (productId == null) {
            if (other.productId != null)
                return false;
        } else if (!productId.equals(other.productId))
            return false;
        return true;
    }
   public void removeProduct(Product product) {
        productId = product.getModelNr();
        for (int i = 0; i < selectedProducts.size(); i++) {
            if (selectedProducts.get(i) == productId) {
                selectedProducts.remove(i);
                break; //in case there are many, only one instance should be removed
            }
        }
    }*/
}
