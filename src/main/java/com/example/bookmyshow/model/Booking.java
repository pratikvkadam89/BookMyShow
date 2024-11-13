package com.example.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    private Movie movie;
    private List<ShowSeat> showSeatList;
    private Show show;
    private User user;
}
