package com.delivery.drone.Enum;

public enum OrderStatus {
    NOT_PAID("NOT_PAID"),
    PAID("PAID");

    private  String OrderStatus;

    OrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }
}
