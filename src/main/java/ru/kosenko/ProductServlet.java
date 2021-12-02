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
                new Product(1, "Xiaomi Redmi 10 4/64GB", 15900),
                new Product(2,"Xiaomi Redmi Note 10S 6/128GB", 21700),
                new Product(3,"Xiaomi Redmi 9A 2/32GB", 8450),
                new Product(4,"Xiaomi 11 Lite NE 5G 8/256GB", 31150),
                new Product(5,"POCO F3 8/256GB (серебристый) ", 34750),
                new Product(6,"POCO F3 6/128GB (серебристый)", 31940),
                new Product(7,"Xiaomi Redmi 9C NFC 2/32GB (синий)", 9680),
                new Product(8,"Xiaomi Redmi Note 10S 6/128GB (серый)", 21970),
                new Product(9,"Xiaomi 11T Pro 8/128GB (синий) ", 53020),
                new Product(10,"Xiaomi 11 Lite NE 5G 8/128GB (розовый) ", 31930)
        };
        for (Product product : products){
            resp.getWriter().println("id" + product.getId() + ", " +
                    "title" + product.getTitle() + ", " +
                    "cost" + product.getCost());
        }
    }
}
