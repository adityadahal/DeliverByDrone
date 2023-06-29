package com.delivery.drone.Enum;

import lombok.Data;


public enum ProductStatus {
    PRODUCT_AVAILABLE("PRODUCT_AVAILABLE"),
    PRODUCT_UNAVAILABLE("PRODUCT_UNAVAILABLE");

    private String ProductStatus;

    private  ProductStatus(String ProductStatus){
        this.ProductStatus = ProductStatus;
    }
    public  String getProductStatus(){
        return ProductStatus;
    }
}
