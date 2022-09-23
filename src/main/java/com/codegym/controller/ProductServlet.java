package com.codegym.controller;

import com.codegym.dao.CategoryService;
import com.codegym.dao.CategoryServiceImpl;
import com.codegym.dao.ProductService;
import com.codegym.dao.ProductServiceImpl;
import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    ProductService productService=new ProductServiceImpl();
    CategoryService categoryService=new CategoryServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("product/list.jsp");
        List<Product> productList=productService.selectAll();
        List<Category> categoryList=findAllCategory(productList);
        String cateID=request.getParameter("category");
        if(cateID!=null){
            productList=productService.
        }
        request.setAttribute("products",productList);
        request.setAttribute("categories",categoryList);
        requestDispatcher.forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    List<Category> findAllCategory(List<Product> products){
        List<Category> list=new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            Category category= categoryService.select(products.get(i).getCategoryId());
            list.add(category);
        }
        return list;
    }
}
