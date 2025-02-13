package com.abhishek.design.pattern.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat implements Animal {
    @Override
    public void speak() {
        log.info("Meow");
    }
}