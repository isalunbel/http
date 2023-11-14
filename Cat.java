package org.example;

public class Cat {
     public String id;
     public String text;
     public Integer upvotes;

    // getters and setters

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}
