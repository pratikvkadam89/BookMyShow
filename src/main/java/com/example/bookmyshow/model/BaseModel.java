package com.example.bookmyshow.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue
    int id;
    @CreationTimestamp
    Date dateCreated;
    @UpdateTimestamp
    Date dateUpdated;
}
