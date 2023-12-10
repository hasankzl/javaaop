package org.example;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){
        //logging
        //authentication & authorization
        // sanitize the data
        System.out.println("checkout method from shoppingCart called");
    }

    public int quantity(){
        return 2;
    }
}
