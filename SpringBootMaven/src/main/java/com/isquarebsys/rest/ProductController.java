package com.isquarebsys.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController
{
	@CrossOrigin
    @RequestMapping("/products/view")
    public List<Product> getProducts()
    {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Product 1","100"));
        productList.add(new Product(2,"Product 2","200"));
        return productList;
    }
	@CrossOrigin
    @RequestMapping("/add/products")
	@Consumes(MediaType.APPLICATION_JSON)
    public Product addProduct(@RequestBody Product product)
    {
		System.out.println("Product to be saved->"+"Name: "+product.getName()+";"+"Cost:"+product.getCost()+";"+"Id: "+product.getId());
//        Product product=new Product(1,"Product 1","100");
        return product;
    }    
}

