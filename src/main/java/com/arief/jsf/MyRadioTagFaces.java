package com.arief.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="radioBean",eager = true)
public class MyRadioTagFaces {

    private String gender;
    private String item;
    private String arr[];

    public void setItem(String item){
        this.item=item;
    }
    public String getItem(){
        return item;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    public void setArr(String []arr){
        this.arr=arr;
    }
    public String[] getArr(){
        return arr;
    }
}
