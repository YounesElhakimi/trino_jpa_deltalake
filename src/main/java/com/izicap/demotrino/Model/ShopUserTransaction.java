package com.izicap.demotrino.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShopUserTransaction implements Serializable {
    private Long shop_id;
    private String unique_id;
    private String card_token;
    private String customer_id;
    private Long user_id;
    private java.sql.Timestamp purchase_date;
    private java.sql.Date commercial_date;
    private String currency;
    private BigDecimal amount;
    private Integer transaction;
    private Integer year_rank;
    private Boolean member;
    private String transaction_type;
    private Integer new_customer;
    private Integer old_customer;
    private String acceptance;
}