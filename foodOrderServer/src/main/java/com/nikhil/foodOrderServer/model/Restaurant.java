package com.nikhil.foodOrderServer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String owner;
    private String name;
    private String description;
    private String contactInformation;
    private String openingHours;
    private String reviews;
    private Order orders;
    private int numRating;
    private List<String> images = new ArrayList<>();
    private Date registrationDate;
    private String open;
    private Food foods;
}
