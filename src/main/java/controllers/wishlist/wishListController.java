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
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "wishlistController", value = "/wishlist-servlet")
public class wishListController extends HttpServlet{



    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        //PrintWriter out = response.getWriter();
        out.append(request.getParameter("name"));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/WishList.jsp"); /*what path?*/
        dispatcher.forward(request, response);
    }

    public void destroy() {
    }

}
