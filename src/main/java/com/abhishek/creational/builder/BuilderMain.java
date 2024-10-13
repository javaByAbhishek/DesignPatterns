package com.abhishek.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Post post = new Post.Builder()
                .setTitle("My First Post")
                .setContent("This is the content of my first post.")
                .setAuthor("John Doe")
                .build();

        System.out.println("Post created: " + post);
    }
}