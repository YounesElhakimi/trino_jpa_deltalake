package com.izicap.demotrino.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "shopusertransaction" , schema = "shop_user_transaction_schema")
public class ShopUserTransaction implements Serializable {

    @Id
    @Column(name = "shop_id")
    private Long shopId;

    @Column(name = "unique_id")
    private String uniqueId;

    @Column(name = "card_token")
    private String cardToken;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "purchase_date")
    private Timestamp purchaseDate;

    @Column(name = "commercial_date")
    private Date commercialDate;

    @Column(name = "currency")
    private String currency;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "transaction")
    private Integer transaction;

    @Column(name = "year_rank")
    private Integer yearRank;

    @Column(name = "member")
    private Boolean member;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "new_customer")
    private Integer newCustomer;

    @Column(name = "old_customer")
    private Integer oldCustomer;

    @Column(name = "acceptance")
    private String acceptance;

}
