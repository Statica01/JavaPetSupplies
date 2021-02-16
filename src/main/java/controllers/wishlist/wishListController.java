package controllers.wishlist;

import domain.entities.shop.Catalog;
import domain.entities.shop.Product;
import domain.entities.wishList.WishList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "wishlistController", value = "/wishlist-servlet")
//@WebServlet("/wishlist-servlet")
public class wishListController extends HttpServlet{



    private String message;

    public void init() {
        message = "Wishlist servlet initiated!";
        System.out.println(message);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("in do get");
        response.setContentType("text/html");


        String name = request.getParameter("name");
        if(name != null) {
            System.out.println("input is not null");
        }
        //String name = "name";
        else {
            Catalog catalog = new Catalog();
            Product product = new Product("name",
                    "A1",
                    99,
                    "B1",
                    1,
                    "Shampoo.",
                    catalog
            );

            System.out.println("product with description " + product.getDescription() + " is created!");

            WishList wishList = new WishList(1); //Customer no 1
            wishList.addProduct(product);
            //String name = product.getProductName();

            request.getSession().setAttribute("product", product);
        }
        //out.write("product");
        RequestDispatcher r = request.getRequestDispatcher("/views/WishList.jsp");
        r.forward(request, response);
        //response.sendRedirect("/views/WishList.jsp");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        //out.println("<h1>" + "title:" + request.getParameter("name") + "</h1>");
        out.println("<h1>" + "title:" + name + "</h1>");
        out.println("</body></html>");
        out.append(name);
        out.write(name);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("in do post");
        response.setContentType("text/html");
        String name = request.getParameter("name");
        //String name = "name";

        Catalog catalog = new Catalog();
        Product product = new Product(name,
                "A1",
                99,
                "B1",
                1,
                "Shampoo.",
                catalog
        );

        WishList wishList = new WishList(1); //Customer no 1
        wishList.addProduct(product);
        //String name = product.getProductName();

        request.setAttribute("product", product);
        //out.write("product");
        //RequestDispatcher r = request.getRequestDispatcher("/views/WishList.jsp");
        //r.forward(request, response);
        response.sendRedirect("/views/WishList.jsp");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        //out.println("<h1>" + "title:" + request.getParameter("name") + "</h1>");
        out.println("<h1>" + "title:" + name + "</h1>");
        out.println("</body></html>");
        out.append(name);
        out.write(name);

    }

/*    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //doGet(request,response);

        String name = request.getParameter("name");
        Catalog catalog = new Catalog();
        Product product = new Product(name,
                "A1",
                99,
                "B1",
                1,
                "Shampoo.",
                catalog
        );

        WishList wishList = new WishList(1); //Customer no 1
        wishList.addProduct(product);
        //String name = product.getProductName();

        request.setAttribute("product", product);
        request.getRequestDispatcher("views/WishList.jsp").forward(request, response);
        //response.sendDirect("views/WishList.jsp");
    }*/

    public void destroy() {
    }

}
