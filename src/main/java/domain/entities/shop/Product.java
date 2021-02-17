package domain.entities.shop;

//import Catalog;
//import Compartment;

import javax.servlet.http.HttpServlet;

public class Product extends HttpServlet {

    private String productName;
    private static int id = 1; //id should be unique
    private int productId;
    private String modelNr;
    private int productPrice;
    private String imgReference;
    private int category;
    private String description;

    public Product(String name, String nr, int productPrice, String imgRef, int cat, String descr ){

        productName = name;
        setProductId();
        modelNr = nr;
        this.productPrice = productPrice;
        imgReference = imgRef;
        category = cat;
        description = descr;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId() {
        this.productId = id;
        id++; //the class variable is increased
    }

    public String getModelNr() {
        return modelNr;
    }

    public void setModelNr(String modelNr) {
        this.modelNr = modelNr;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getImgReference() {
        return imgReference;
    }

    public void setImgReference(String imgReference) {
        this.imgReference = imgReference;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
