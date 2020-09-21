package com.javarush.task.task31.task3113;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

/* 
Что внутри папки?
*/
public class Solution {
    static int folderCount = 0;
    static int filesCount = 0;
    static long size = 0;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path file = Paths.get(scanner.nextLine());


        scanner.close();

        boolean isFolder = Files.isDirectory(file);

        if ( !isFolder ) {
            System.out.println(file.toAbsolutePath().toString() + " - не папка");
        } else {
            Files.walkFileTree(file, new fileVisitor());

            System.out.println("Всего папок - " + (folderCount-1));
            System.out.println("Всего файлов - " + filesCount);
            System.out.println("Общий размер - " + size);
        }
    }

    public static class fileVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            folderCount += 1;
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            filesCount += 1;
            size += attrs.size();
            return FileVisitResult.CONTINUE;
        }
    }
}
