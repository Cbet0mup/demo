package com.example.demo.zipzip;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipStart {
    public static void main(String[] args) {

        String text = "Hello World lkjhlkjhkjh khkjh kjh kjhkj hkj hk jhkj hkjh!";
        byte[] textBytes = text.getBytes();

        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:\\java\\myProjects\\demo\\src\\main\\resources\\files\\output.zip"));
            InputStream fis = new ByteArrayInputStream(textBytes);)
        {

            ZipEntry entry1=new ZipEntry("text.txt");
            zout.putNextEntry(entry1);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // добавляем содержимое к архиву
            zout.write(buffer);
            // закрываем текущую запись для новой записи
            zout.closeEntry();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
