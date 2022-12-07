package com.example.demo.string;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class MainString {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\java\\myProjects\\demo\\src\\main\\java\\com\\example\\demo\\string\\123.xml");
        byte [] q = fileInputStream.readAllBytes();

        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(new String(q, StandardCharsets.UTF_8));

        String s = StandardCharsets.UTF_8.decode(byteBuffer).toString();

        System.out.println(s);


    }
}
