package com.nikhil.foodOrderServer.response;

import com.nikhil.foodOrderServer.model.USER_ROLE;
import com.nikhil.foodOrderServer.model.User;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;

}
