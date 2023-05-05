package com.izicap.demotrino.service;


import com.izicap.demotrino.repository.ShopUserTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopUserTransactionServiceImp implements  ShopUserTransactionService{

    @Autowired
    ShopUserTransactionRepository shopUserTransactionRepository;
    @Override
    public Long getTheLastId() {
        return shopUserTransactionRepository.getMaxId();
    }
}
