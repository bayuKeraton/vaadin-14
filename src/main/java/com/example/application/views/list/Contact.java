package com.example.application.views.list;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class Contact {

//    rule of validations
    @Email
    @NotEmpty
    private String email="";
}
