package com.devsuperior.dsvendas.DTO;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {

    private String sellerName;
    private Double sum;
    private static final long serialVersionUID = 1L;

    public SaleSumDTO() {
    }

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
