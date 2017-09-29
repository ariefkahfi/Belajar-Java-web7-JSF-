package com.arief.controllers;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="controllerBean",eager = true)
public class FacesController {

    public String welcomePage(){
        return "/welcome";
    }

    public String resultPage(){
        return "/pages/result";
    }
}
