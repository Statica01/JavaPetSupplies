package controllers.wishlist;

import Services.WishListService;
import domain.entities.shop.Product;
import domain.entities.wishList.WishList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/index.do")//(name = "wishlistController", value = "/wishlist-servlet")
public class addToWishListController extends HttpServlet{

    private WishListService wishListService = new WishListService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/index.jsp").forward(
                request, response);
        /*
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        //PrintWriter out = response.getWriter();
        out.append(request.getParameter("name"));*/
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //doGet(request,response);

        String name = request.getParameter("name");
        Product product = new Product(name,
                "A1",
                99,
                "B1",
                1,
                "Shampoo."

        );

        wishListService.addToWishList(new WishList(2, "productName"));
        response.sendRedirect("/wishList.do");

    }

    public void destroy() {
    }

}
