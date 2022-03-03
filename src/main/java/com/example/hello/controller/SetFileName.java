package com.example.hello.controller;

import java.io.File;

public class SetFileName {
    public static void main(String[] args) {
        File dir = new File("d:\\downloads\\");
        File[] files = dir.listFiles();
    }
}
