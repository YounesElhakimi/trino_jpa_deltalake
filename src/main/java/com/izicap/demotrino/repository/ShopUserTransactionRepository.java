package com.izicap.demotrino.repository;



import com.izicap.demotrino.entities.ShopUserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopUserTransactionRepository extends JpaRepository<ShopUserTransaction, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM deltalake.shop_user_transaction_schema.shopusertransaction")
    List<ShopUserTransaction> findAllShopUserTransactions();

}
