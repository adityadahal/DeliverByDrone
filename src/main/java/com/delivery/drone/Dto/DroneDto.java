package com.delivery.drone.Dto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DroneDto {
    private  int id;
    @NotBlank(message = "Drone Name must not be empty")
    private  String droneName;
    private  int orderId;
    private String otp;
}
