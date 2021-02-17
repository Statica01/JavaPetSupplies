/*package domain.entities.shop;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;

public class Compartment extends HttpServlet {

    private String id;
    private ArrayList<Product> items = new ArrayList<>();

    public Compartment(Product product, Catalog catalog) {
        String modelNr = product.getModelNr();
        id = modelNr;

        catalog.addCompartment(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public void setItems(ArrayList<Product> items) {
        this.items = items;
    }

    public void addItem(Product product) {
        this.items.add(product);
    }
}*/
