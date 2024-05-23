package com.myapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

    private int age;
    private String firstName;
    private String lastName;
    private Gender gender;

}
