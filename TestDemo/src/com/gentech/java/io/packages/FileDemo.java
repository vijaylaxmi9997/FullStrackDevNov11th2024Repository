package com.gentech.java.io.packages;
import java.io.File;
public class FileDemo {
    public static void main(String[] args) {
        File f1=new File("C:\\Demo\\Test\\Sample.txt");
        System.out.println(f1);
        File f2=new File("C:/Demo/Test/Sample.txt");
        System.out.println(f2);
    }
}
