package com.example.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private Show show;
    private Seat seat;
    private BookingStatus bookingStatus;
}
