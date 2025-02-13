package com.abhishek.design.pattern.creational.builder;

import lombok.ToString;

@ToString
public class Post {
    private final String title;
    private final String content;
    private final String author;

    public Post(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
    }

    public static class Builder {
        private String title;
        private String content;
        private String author;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }
}
