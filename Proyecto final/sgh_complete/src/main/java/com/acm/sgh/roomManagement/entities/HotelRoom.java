package com.acm.sgh.roomManagement.entities;

import com.acm.sgh.hotelManagement.entities.Hotel;
import com.acm.sgh.roomManagement.enumeration.RoomType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "hotel_rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "room_type", nullable = false, length = 20)
    private RoomType roomType;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(length = 20)
    private String availability;

    @Column(nullable = false)
    private Boolean status;

    @Column(nullable = false)
    private Integer floor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    @ToString.Exclude
    private Hotel hotel;
}
