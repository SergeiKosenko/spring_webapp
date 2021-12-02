package ru.kosenko;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/product-annotations")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product[] products = {
                new Product(1, "", 1200),
                new Product(2,"", 700),
                new Product(3,"", 850),
                new Product(4,"", 1150),
                new Product(5,"", 750),
                new Product(6,"", 940),
                new Product(7,"", 680),
                new Product(8,"", 970),
                new Product(9,"", 1020),
                new Product(10,"", 1130),
                new Product(11,"", 975)
        };
        for (Product product : products){
            resp.getWriter().println("id" + product.getId() + ", " +
                    "title" + product.getTitle() + ", " +
                    "cost" + product.getCost());
        }
    }
}
