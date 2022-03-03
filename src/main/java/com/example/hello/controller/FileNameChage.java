package com.example.hello.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNameChage {
    public static void main(String[] args) throws IOException {
        String directory = "D:\\test";
        File dir = new File(directory);

        // 디렉토리 내 파일 리스트 확인  ver 1
        String[] list = dir.list();
        for (int i = 0; i < list.length; i++) {
            String filename = list[i];
            System.out.println(filename);
        }
        System.out.println("--------------------------------------");

        // 파일 내 택스트 확인
        FileReader fileReader = new FileReader("D:\\test.txt");
        BufferedReader bfr = new BufferedReader(fileReader);

        String line;
        while((line = bfr.readLine()) != null) {
            for (int i = 0; i < list.length; i++) {
                // list[i];
            }
        }
        System.out.println("--------------------------------------");

        // 디렉토리 내 파일 리스트 확인  ver 2
        for (String filename : list) {
            System.out.println(filename);
        }
    }
}