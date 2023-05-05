package com.izicap.demotrino.Controller;


import com.izicap.demotrino.service.ShopUserTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxIdController {
    @Autowired
    ShopUserTransactionService shopUserTransactionService;
    @GetMapping("max")
    Long getLastId(){
        return shopUserTransactionService.getTheLastId();
    }
}
