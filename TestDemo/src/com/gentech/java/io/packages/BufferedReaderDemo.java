package com.gentech.java.io.packages;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedReaderDemo {

    public static void main(String[] args) {
        readContent();
    }

    private static void readContent()
    {
        BufferedReader br=null;
        try
        {
            br=new BufferedReader(new FileReader("C:\\Demo\\Test\\Sample2.txt"));
            String strLine=" ";
            while((strLine=br.readLine())!=null)
            {
                System.out.println(strLine);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
