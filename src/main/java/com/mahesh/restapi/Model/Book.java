package com.mahesh.restapi.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private long Id;
    private String title;
    private String authorName;
    private int cost;

    public Book(long Id, String title, String authorName,int cost){
        this.authorName = authorName;
        this.cost = cost;
        this.Id = Id;
        this.title = title;
    }



}
