package com.gentech.java.io.packages;
import java.io.File;
public class FileDemo1 {
    public static void main(String[] args) {
        File f1=new File("C:\\Demo\\Test\\Sample.txt");
        System.out.println(f1);
        String name=f1.getName();
        System.out.println("File name:"+name);
        String fpath=f1.getParent();
        System.out.println("folder path:"+fpath);
        String fpath1=f1.getParent();
        System.out.println("folder path:"+fpath1);
        File filepath1=f1.getAbsoluteFile();
        System.out.println("File Path:"+filepath1);
        File filepath2=f1.getAbsoluteFile();
        System.out.println("File Path:"+filepath2);

        boolean v1=f1.canRead();
        System.out.println("read Permision:"+v1);
        boolean v2=f1.canWrite();
        System.out.println("Write Permision:"+v2);
        boolean v3=f1.canExecute();
        System.out.println("Execute Permision:"+v3);
    }
}
