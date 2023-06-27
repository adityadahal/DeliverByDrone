package com.delivery.drone.Dto;
import com.delivery.drone.Enum.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private  int id;
    private String orderName;
    private OrderStatus orderStatus;
    private int product_id;
    private int customer_id;
}
