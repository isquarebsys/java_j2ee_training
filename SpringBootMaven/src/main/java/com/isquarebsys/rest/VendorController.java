package com.isquarebsys.rest;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class VendorController
{
    @RequestMapping("/vendors")
    public List<Vendor> getEmployees()
    {
        List<Vendor> vendorList = new ArrayList<Vendor>();
        vendorList.add(new Vendor(1,"vijay","p","isquarebsys@gmail.com"));
        return vendorList;
    }
}

