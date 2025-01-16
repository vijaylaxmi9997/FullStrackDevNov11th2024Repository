package com.gentech.java.io.packages;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        //CreateFolder();
        //CreateNestedFolder();
        //RenameFolder();
        // deleteFolder();
       FolderCollection();
    }
    private static void CreateFolder()
    {
        try {
            File f1=new File("C:\\Demo\\Test\\Welcome");
            boolean v1=f1.mkdir();
            System.out.println("It Folder create?:"+v1);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void CreateNestedFolder()
    {
        File f1=new File("C:\\Demo\\Test\\TT1\\TT2\\TT3\\TT4");
        boolean v1=f1.mkdirs();
        System.out.println("it nested Folder create?:"+v1);
    }
    private static void RenameFolder()
    {
        File f1=new File("C:\\Demo\\Test\\Welcome");
        File f2=new File("C:\\Demo\\Test\\Welcome-Latest");
        f1.renameTo(f2);

    }
    private static void  deleteFolder()
    {
        File f2=new File("C:\\Demo\\Test\\Welcome-Latest");
        boolean v1=f2.delete();
        System.out.println("it folder Delete? :"+v1);

    }
    private static void  FolderCollection()
    {
        try {
            File f1=new File("C:\\Demo\\Test");
            File arr[]=f1.listFiles();
            for(int i=0; i< arr.length; i++)
            {
                File f2=arr[i].getAbsoluteFile();
                if(!f2.isFile())
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
