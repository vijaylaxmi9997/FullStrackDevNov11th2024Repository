package com.gentech.java.io.packages;
import java.io.File;
public class FileDemo2 {
    public static void main(String[] args) {
       // CreateFile();
       // RenameFile();
       // deleteFile();
        FileCollection();
    }
    private static void CreateFile()
    {
        try {
            File f1=new File("C:\\Demo\\Test\\Sample2.txt");
            f1.createNewFile();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void RenameFile()
    {
            File f1=new File("C:\\Demo\\Test\\Sample2.txt");
            File f2=new File("C:\\Demo\\Test\\Demos2.txt");
            f1.renameTo(f2);

    }
    private static void deleteFile()
    {
        File f2=new File("C:\\Demo\\Test\\Demos2.txt");
        boolean v1=f2.delete();
        System.out.println("it file Delete? :"+v1);

    }
    private static void FileCollection()
    {
        try {
            File f1=new File("C:\\Demo\\Test");
            File arr[]=f1.listFiles();
            for(int i=0; i< arr.length; i++)
            {
                File f2=arr[i].getAbsoluteFile();
                if(f2.getName().contains("txt"))
                {
                    System.out.println(f2);
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
