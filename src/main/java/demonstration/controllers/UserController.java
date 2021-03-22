package demonstration.controllers;

import demonstration.Entities.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{userId}")
    public String displayUser(@PathVariable int userId)
    {
        return "Hello user:"+userId;
    }
    @RequestMapping("/{userId}/invoices")
    public String displayUserInvoices(@PathVariable("userId") int userId,
                                      @RequestParam(value="date",required = false) Date dateOrNull)
    {
        return "Invoice found for user "+userId+" on the date " +dateOrNull;
    }
    @RequestMapping("/{userId}/items")
    public List<String> displayStringJson(){
        return Arrays.asList("Shoes","Laptop","Button");
    }
    @RequestMapping("/{userId}/products")
    public List<Product> displayProductsJson(){
        return Arrays.asList(new Product(1,"Shoes",60),new Product(2,"Laptop",1200),new Product(3,"Bag",150));
    }
}
