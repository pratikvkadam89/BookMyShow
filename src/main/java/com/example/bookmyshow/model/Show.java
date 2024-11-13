package com.example.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "bms_show")
public class Show extends BaseModel{
    Date startTime;
    private Movie movie;
    private Theatre theatre;
    private Screen screen;
    private Language language;
    private Feature feature;
    private List<ShowSeat> showSeatList;
}
