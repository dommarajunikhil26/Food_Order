package com.nikhil.foodOrderServer.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class ContactInformation {
    private String email;
    private String phone;
    private String twitter;
    private String instagram;
}
