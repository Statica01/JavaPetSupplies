package Services;

import domain.entities.wishList.WishList;

import java.util.ArrayList;
import java.util.List;

public class WishListService {


    private static List<WishList> selectedProducts = new ArrayList<WishList>();


   static {
       selectedProducts.add(new WishList(2, "ShampooDog"));
   }

   public void addToWishList(WishList wishList) {selectedProducts.add(wishList);}
   public List<WishList> retrieveWishList() {return selectedProducts; }
}
