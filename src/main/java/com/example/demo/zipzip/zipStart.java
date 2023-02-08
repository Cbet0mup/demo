package com.example.demo.zipzip;

import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Log4j2
public class zipStart {
    public static void main(String[] args) {

        String text = "Hello World lkjhlkjhkjh khkjh kjh kjhkj hkj hk jhkj hkjh!";
        byte[] textBytes = text.getBytes();
//
//        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:\\java\\myProjects\\demo\\src\\main\\resources\\files\\output.zip"));
//            InputStream fis = new ByteArrayInputStream(textBytes))
//        {
//            //ZipEntry entry1=new ZipEntry("text.txt");
//            zout.putNextEntry(new ZipEntry("text.txt"));
//            // считываем содержимое файла в массив byte
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer);
//            // добавляем содержимое к архиву
//            zout.write(buffer);
//
//            // закрываем текущую запись для новой записи
//            zout.closeEntry();
//        }
//        catch(Exception ex){
//
//            System.out.println(ex.getMessage());
//        }


        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ZipOutputStream zipOutputStream = new ZipOutputStream(bos);
             FileInputStream fis = new FileInputStream("/home/pavel/IdeaProjects/demo/G142009_072202_0001.xml"))
        {
            File file = new File("/home/pavel/IdeaProjects/demo/src/main/resources/files/output.zip");
            FileOutputStream fos = new FileOutputStream(file);

            zipOutputStream.putNextEntry(new ZipEntry("G142009_072202_0001.xml"));

            zipOutputStream.write(fis.readAllBytes());
            zipOutputStream.closeEntry();

            fos.write(bos.toByteArray());
            fos.close();


        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }
}
