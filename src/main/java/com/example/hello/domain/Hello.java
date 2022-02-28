package com.example.hello.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.management.ConstructorParameters;

@Getter
@Setter
@ToString
public class Hello {
    private String name;
    private int age;

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.setName("SDfsd");
        hello.setAge(12);

        System.out.println(hello);
    }
}
