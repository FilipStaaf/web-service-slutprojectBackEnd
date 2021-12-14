package com.example.upg3backend.user;


import java.util.ArrayList;
import java.util.List;

import com.example.upg3backend.post.Post;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {

    private String name, password;
    private List<Post> favorites;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.favorites = new ArrayList<>();
    }

}