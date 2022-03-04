package com.example.hello.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileTextAndDIrFile {
    public static void main(String[] args) throws IOException {
        ReadFileTextAndDIrFile readFileTextAndDIrFile = new ReadFileTextAndDIrFile();
        List<String> file = readFileTextAndDIrFile.findFile();
        readFileTextAndDIrFile.changeFileName(file);
    }

    public void changeFileName(List<String> fileList) {
        // 1. file의 파일명 조회
        // 2. 조회한 파일명을 확장자 분리
        // 3. file index 에 맞는 lectures index 를 조회
        // 4. 3번에서 조회된 이름과 2번에서 분리한 확장자를 이용하여 file 이름 변경
        // 최종: file 에 rename 되어야 함
        String dir = "d:\\test\\";
        File file = new File(dir);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            int fileIdx = file.getName().indexOf(".");
            String extIdx = file.getName().substring(fileIdx);
            String fileName = fileList.get(i);
            file.renameTo(new File(dir + fileName + extIdx));
        }
    }

    public List<String> findFile() throws IOException {
        FileReader fileReader = new FileReader("d:\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> list = new ArrayList<>();

        String str = "";
        while ((str = bufferedReader.readLine()) != null) {
            list.add(str);
        }
        return list;
    }
}