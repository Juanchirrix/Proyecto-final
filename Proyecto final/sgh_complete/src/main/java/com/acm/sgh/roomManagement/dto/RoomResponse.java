package com.acm.sgh.roomManagement.dto;

import com.acm.sgh.roomManagement.enumeration.RoomType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class RoomResponse {
    private UUID id;
    private RoomType roomType;
    private Integer capacity;
    private BigDecimal price;
    private String availability;
    private Boolean status;
    private Integer floor;
    private UUID hotelId;
    private String hotelName;
}
