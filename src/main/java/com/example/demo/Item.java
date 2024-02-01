package com.example.demo;

public class Item {
    long id = 0;
    String test = "";

    Item(long id,String test) {
        this.id = id;
        this.test = test;
    }

    public long getId(){
        return this.id;
    }
}
