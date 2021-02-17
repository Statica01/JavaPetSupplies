package controllers.wishlist;


import Services.WishListService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/wishList.do")
public class showWishListController extends HttpServlet {

    private WishListService wishListService = new WishListService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.setAttribute("wishList", wishListService.retrieveWishList());
        request.getRequestDispatcher("/views/WishList.jsp").forward(request, response);
    }
}
