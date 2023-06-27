package com.delivery.drone.Enum;

public enum OrderStatus {
    PACKED("PACKED"),
    PLACED("PLACED");

    private  String OrderStatus;

    OrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }
}
