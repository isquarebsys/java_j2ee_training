package com.isquarebsys.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController
{
    @RequestMapping("/products")
    public List<Product> getProducts()
    {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Product 1","100"));
        return productList;
    }
}

