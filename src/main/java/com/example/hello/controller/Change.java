package com.example.hello.controller;

import java.io.*;
import java.util.ArrayList;

public class Change {
    public static void main(String[] args) throws IOException {
        FindFile findFile = new FindFile();

        ArrayList<String> str = findFile.FileInfo();
        findFile.FindFileName(str);
    }
}

class FindFile {

    // 디렉토리 내 파일 확인
    public void FindFileName(ArrayList<String> list) throws FileNotFoundException {
        // 1. file의 파일명 조회
        // 2. 조회한 파일명을 확장자 분리
        // 3. file index 에 맞는 lectures index 를 조회
        // 4. 3번에서 조회된 이름과 2번에서 분리한 확장자를 이용하여 file 이름 변경
        // 최종: file 에 rename 되어야 함
        String path = "d:\\test\\";
        File file = new File(path);
        File[] files = file.listFiles();

        int idx_1 = 0;
        for (File file1 : files) {
            int idx = file1.getName().lastIndexOf(".");
            String ext = file1.getName().substring(idx);
            String fileName = list.get(idx_1);
            file1.renameTo(new File(path + ext + fileName));
            idx_1++;
        }
    }

    // 파일 내 내용 확인
    public ArrayList<String> FileInfo() throws IOException {
        FileReader file = new FileReader("D:\\test.txt");
        BufferedReader bfr = new BufferedReader(file);
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = bfr.readLine()) != null) {
            list.add(line);
        }
        return list;
    }
}