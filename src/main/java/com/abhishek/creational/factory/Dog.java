package com.abhishek.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog implements Animal{
    @Override
    public void speak() {
        log.info("Woofs");
    }
}
