package com.example.hello.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTextAndDIrFile {
    public static void main(String[] args) throws IOException {
        String directory = "d:\\lecture\\";

        // 파일 내 택스트 읽어 오기
        FileReader fileReader = new FileReader("d:\\test.txt");

        int str;
        while ((str = fileReader.read()) != -1) {
            System.out.println((char)str);
        }
        System.out.println("--------------------------------------");

        // 디렉토리 내 파일 리스트 출력  ver 1
        File dir = new File(directory);
        String[] list = dir.list();

/*
                for (int i = 0; i < list.length; i++) {
            String filename = list[i];
            System.out.println(filename);
        }
        System.out.println("--------------------------------------");


        // 디렉토리 내 파일 리스트 출력  ver 2
        for (String filename : list) {
            System.out.println(filename);
        }

 */
    }
}