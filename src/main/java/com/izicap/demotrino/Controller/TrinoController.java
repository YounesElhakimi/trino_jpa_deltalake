package com.izicap.demotrino.Controller;

import com.izicap.demotrino.DB.TrinoConnector;
import com.izicap.demotrino.Model.ShopUserTransaction;
import com.izicap.demotrino.repository.ShopUserTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class TrinoController {

    @Autowired
    ShopUserTransactionRepository shopUserTransactionRepository;
    @GetMapping("/fetch")
    public ResponseEntity<Object> fetch() throws SQLException {
        List<ShopUserTransaction> transactions = TrinoConnector.getInstance().fetchAll();
        return ResponseEntity.ok(transactions);
    }
   @GetMapping("/fetch2")
    public ResponseEntity<List<com.izicap.demotrino.entities.ShopUserTransaction>> fetch2() throws SQLException {
       //    List<com.izicap.demotrino.entities.ShopUserTransaction> transactions =shopUserTransactionRepository.findAllShopUserTransactions();
          List<com.izicap.demotrino.entities.ShopUserTransaction> transactions =shopUserTransactionRepository.findAll();
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/fetch/{id}")
    public ResponseEntity<com.izicap.demotrino.entities.ShopUserTransaction> fetchById(@PathVariable  Long id) throws SQLException {

        com.izicap.demotrino.entities.ShopUserTransaction transaction =shopUserTransactionRepository.findById(id).get();
        return ResponseEntity.ok(transaction);
    }
}
